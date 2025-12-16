package net.bytebuddy.description.annotation;

import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.k;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;

/* loaded from: classes8.dex */
public interface AnnotationValue<T, S> {

    public enum Sort {
        BOOLEAN(90),
        BYTE(66),
        SHORT(83),
        CHARACTER(67),
        INTEGER(73),
        LONG(74),
        FLOAT(70),
        DOUBLE(68),
        STRING(115),
        TYPE(99),
        ENUMERATION(UpdateStatusCode.DialogButton.CONFIRM),
        ANNOTATION(64),
        ARRAY(91),
        NONE(0);


        /* renamed from: b, reason: collision with root package name */
        public final int f416101b;

        Sort(int i12) {
            this.f416101b = i12;
        }

        public static Sort a(TypeDefinition typeDefinition) {
            return typeDefinition.Q2(Boolean.TYPE) ? BOOLEAN : typeDefinition.Q2(Byte.TYPE) ? BYTE : typeDefinition.Q2(Short.TYPE) ? SHORT : typeDefinition.Q2(Character.TYPE) ? CHARACTER : typeDefinition.Q2(Integer.TYPE) ? INTEGER : typeDefinition.Q2(Long.TYPE) ? LONG : typeDefinition.Q2(Float.TYPE) ? FLOAT : typeDefinition.Q2(Double.TYPE) ? DOUBLE : typeDefinition.Q2(String.class) ? STRING : typeDefinition.Q2(Class.class) ? TYPE : typeDefinition.I() ? ENUMERATION : typeDefinition.X() ? ANNOTATION : typeDefinition.w2() ? ARRAY : NONE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f416102b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f416103c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f416104d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ State[] f416105e;

        static {
            State state = new State("UNDEFINED", 0);
            f416102b = state;
            State state2 = new State("UNRESOLVED", 1);
            f416103c = state2;
            State state3 = new State("RESOLVED", 2);
            f416104d = state3;
            f416105e = new State[]{state, state2, state3};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f416105e.clone();
        }

        public final boolean a() {
            return this == f416104d;
        }
    }

    public static abstract class b<U, V> implements AnnotationValue<U, V> {
        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final <W> W b(Class<? extends W> cls) {
            return cls.cast(a());
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<U, V> q(a.d dVar) {
            return p(dVar, dVar.getReturnType());
        }
    }

    public static class c<U extends Annotation> extends b<AnnotationDescription, U> {

        /* renamed from: a, reason: collision with root package name */
        public final AnnotationDescription f416106a;

        public static class a<V extends Annotation> extends k.a<V> {

            /* renamed from: a, reason: collision with root package name */
            public final V f416107a;

            public a(V v12) {
                this.f416107a = v12;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final Object a() {
                return this.f416107a;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final boolean c(Object obj) {
                return this.f416107a.equals(obj);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return kVar.getState().a() && this.f416107a.equals(kVar.a());
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final State getState() {
                return State.f416104d;
            }

            public final int hashCode() {
                return this.f416107a.hashCode();
            }

            public final String toString() {
                return this.f416107a.toString();
            }
        }

        public c(AnnotationDescription annotationDescription) {
            this.f416106a = annotationDescription;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Object a() {
            return this.f416106a;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this != obj) {
                if (obj instanceof AnnotationValue) {
                    if (this.f416106a.equals(((AnnotationValue) obj).a())) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416104d;
        }

        public final int hashCode() {
            return this.f416106a.hashCode();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.ANNOTATION;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<AnnotationDescription, U> p(a.d dVar, TypeDefinition typeDefinition) {
            TypeDescription typeDescriptionF5 = typeDefinition.f5();
            AnnotationDescription annotationDescription = this.f416106a;
            if (typeDescriptionF5.equals(annotationDescription.a())) {
                return this;
            }
            return new g(dVar, dVar.getReturnType().w2() ? RenderingDispatcher.f416081e.a(Sort.ANNOTATION) : annotationDescription.toString());
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<U> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            AnnotationDescription annotationDescription = this.f416106a;
            try {
                return new a(annotationDescription.c(Class.forName(annotationDescription.a().getName(), false, classLoader)).load());
            } catch (ClassNotFoundException e12) {
                return new h.a(annotationDescription.a().getName(), e12);
            }
        }

        public final String toString() {
            return this.f416106a.toString();
        }
    }

    public static class d<U, V> extends b<U, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f416108a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f416109b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends AnnotationValue<?, ?>> f416110c;

        /* renamed from: d, reason: collision with root package name */
        public transient /* synthetic */ int f416111d;

        public static class a<W> extends k.a<W> {

            /* renamed from: a, reason: collision with root package name */
            public final Class<W> f416112a;

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList f416113b;

            /* renamed from: c, reason: collision with root package name */
            public transient /* synthetic */ int f416114c;

            public a(Class cls, ArrayList arrayList) {
                this.f416112a = cls;
                this.f416113b = arrayList;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final W a() throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
                ArrayList arrayList = this.f416113b;
                W w12 = (W) Array.newInstance((Class<?>) this.f416112a, arrayList.size());
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    Array.set(w12, i12, ((k) it.next()).a());
                    i12++;
                }
                return w12;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final boolean c(Object obj) {
                if (!(obj instanceof Object[]) || obj.getClass().getComponentType() != this.f416112a) {
                    return false;
                }
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = this.f416113b;
                if (arrayList.size() != objArr.length) {
                    return false;
                }
                Iterator it = arrayList.iterator();
                for (Object obj2 : objArr) {
                    if (!((k) it.next()).c(obj2)) {
                        return false;
                    }
                }
                return true;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                if (!kVar.getState().a()) {
                    return false;
                }
                Object objA = kVar.a();
                if (!(objA instanceof Object[])) {
                    return false;
                }
                Object[] objArr = (Object[]) objA;
                ArrayList arrayList = this.f416113b;
                if (arrayList.size() != objArr.length) {
                    return false;
                }
                Iterator it = arrayList.iterator();
                for (Object obj2 : objArr) {
                    k kVar2 = (k) it.next();
                    if (!kVar2.getState().a() || !kVar2.a().equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final State getState() {
                Iterator it = this.f416113b.iterator();
                while (it.hasNext()) {
                    if (!((k) it.next()).getState().a()) {
                        return State.f416103c;
                    }
                }
                return State.f416104d;
            }

            @k.c
            public final int hashCode() {
                int i12;
                if (this.f416114c != 0) {
                    i12 = 0;
                } else {
                    Iterator it = this.f416113b.iterator();
                    int iHashCode = 1;
                    while (it.hasNext()) {
                        iHashCode = (iHashCode * 31) + ((k) it.next()).hashCode();
                    }
                    i12 = iHashCode;
                }
                if (i12 == 0) {
                    return this.f416114c;
                }
                this.f416114c = i12;
                return i12;
            }

            public final String toString() {
                return RenderingDispatcher.f416081e.i(this.f416113b);
            }
        }

        public d(Class<?> cls, TypeDescription typeDescription, List<? extends AnnotationValue<?, ?>> list) {
            this.f416108a = cls;
            this.f416109b = typeDescription;
            this.f416110c = list;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final U a() throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
            List<? extends AnnotationValue<?, ?>> list = this.f416110c;
            U u12 = (U) Array.newInstance(this.f416108a, list.size());
            Iterator<? extends AnnotationValue<?, ?>> it = list.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Array.set(u12, i12, it.next().a());
                i12++;
            }
            return u12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnnotationValue)) {
                return false;
            }
            Object objA = ((AnnotationValue) obj).a();
            if (!objA.getClass().isArray()) {
                return false;
            }
            List<? extends AnnotationValue<?, ?>> list = this.f416110c;
            if (list.size() != Array.getLength(objA)) {
                return false;
            }
            Iterator<? extends AnnotationValue<?, ?>> it = list.iterator();
            for (int i12 = 0; i12 < list.size(); i12++) {
                if (!it.next().a().equals(Array.get(objA, i12))) {
                    return false;
                }
            }
            return true;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416104d;
        }

        @k.c
        public final int hashCode() {
            int i12;
            if (this.f416111d != 0) {
                i12 = 0;
            } else {
                Iterator<? extends AnnotationValue<?, ?>> it = this.f416110c.iterator();
                int iHashCode = 1;
                while (it.hasNext()) {
                    iHashCode = (iHashCode * 31) + it.next().hashCode();
                }
                i12 = iHashCode;
            }
            if (i12 == 0) {
                return this.f416111d;
            }
            this.f416111d = i12;
            return i12;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.ARRAY;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final AnnotationValue<U, V> p(a.d dVar, TypeDefinition typeDefinition) {
            boolean zW2 = typeDefinition.w2();
            TypeDescription typeDescription = this.f416109b;
            if (!zW2 || !typeDefinition.m().f5().equals(typeDescription)) {
                return new g(dVar, RenderingDispatcher.f416081e.a(Sort.a(typeDescription)));
            }
            Iterator<? extends AnnotationValue<?, ?>> it = this.f416110c.iterator();
            while (it.hasNext()) {
                AnnotationValue<U, V> annotationValue = (AnnotationValue<U, V>) it.next().p(dVar, typeDefinition.m());
                if (annotationValue.getState() != State.f416104d) {
                    return annotationValue;
                }
            }
            return this;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<V> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            TypeDescription typeDescription = this.f416109b;
            List<? extends AnnotationValue<?, ?>> list = this.f416110c;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<? extends AnnotationValue<?, ?>> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().r(classLoader));
            }
            try {
                return new a(Class.forName(typeDescription.getName(), false, classLoader), arrayList);
            } catch (ClassNotFoundException e12) {
                return new h.a(typeDescription.getName(), e12);
            }
        }

        public final String toString() {
            return RenderingDispatcher.f416081e.i(this.f416110c);
        }
    }

    public static class g<U, V> extends b<U, V> {

        /* renamed from: a, reason: collision with root package name */
        public final a.d f416122a;

        /* renamed from: b, reason: collision with root package name */
        public final String f416123b;

        public static class a<W> extends k.a.AbstractC11966a<W> {

            /* renamed from: a, reason: collision with root package name */
            public final Method f416124a;

            /* renamed from: b, reason: collision with root package name */
            public final String f416125b;

            public a(Method method, String str) {
                this.f416124a = method;
                this.f416125b = str;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final W a() {
                throw new AnnotationTypeMismatchException(this.f416124a, this.f416125b);
            }

            public final String toString() {
                return AK.c.s(new StringBuilder("/* Warning type mismatch! \""), this.f416125b, "\" */");
            }
        }

        public g(a.d dVar, String str) {
            this.f416122a = dVar;
            this.f416123b = str;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final U a() {
            throw new IllegalStateException(this.f416123b + " cannot be used as value for " + this.f416122a);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416103c;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.NONE;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<U, V> p(a.d dVar, TypeDefinition typeDefinition) {
            return new g(dVar, this.f416123b);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<V> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) throws ClassNotFoundException {
            a.d dVar = this.f416122a;
            try {
                Class<?> cls = Class.forName(dVar.n().getName(), false, classLoader);
                try {
                    return new a(cls.getMethod(dVar.getName(), new Class[0]), this.f416123b);
                } catch (NoSuchMethodException unused) {
                    return new f.a(cls);
                }
            } catch (ClassNotFoundException e12) {
                return new h.a(dVar.n().getName(), e12);
            }
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("/* Warning type mismatch! \""), this.f416123b, "\" */");
        }
    }

    public static class j<U extends Class<U>> extends b<TypeDescription, U> {

        /* renamed from: b, reason: collision with root package name */
        public static final HashMap f416133b = new HashMap();

        /* renamed from: a, reason: collision with root package name */
        public final TypeDescription f416134a;

        public static class a<U extends Class<U>> extends k.a<U> {

            /* renamed from: a, reason: collision with root package name */
            public final U f416135a;

            public a(U u12) {
                this.f416135a = u12;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final Object a() {
                return this.f416135a;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final boolean c(Object obj) {
                return this.f416135a.equals(obj);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return kVar.getState().a() && this.f416135a.equals(kVar.a());
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final State getState() {
                return State.f416104d;
            }

            public final int hashCode() {
                return this.f416135a.hashCode();
            }

            public final String toString() {
                return RenderingDispatcher.f416081e.k(TypeDescription.d.A0(this.f416135a));
            }
        }

        static {
            Class[] clsArr = {Boolean.TYPE, Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
            for (int i12 = 0; i12 < 9; i12++) {
                Class cls = clsArr[i12];
                f416133b.put(TypeDescription.d.A0(cls), cls);
            }
        }

        public j(TypeDescription typeDescription) {
            this.f416134a = typeDescription;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Object a() {
            return this.f416134a;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this != obj) {
                if (obj instanceof AnnotationValue) {
                    if (this.f416134a.equals(((AnnotationValue) obj).a())) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416104d;
        }

        public final int hashCode() {
            return this.f416134a.hashCode();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.TYPE;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<TypeDescription, U> p(a.d dVar, TypeDefinition typeDefinition) {
            String strA;
            if (typeDefinition.f5().Q2(Class.class)) {
                return this;
            }
            if (dVar.getReturnType().w2()) {
                strA = RenderingDispatcher.f416081e.a(Sort.TYPE);
            } else {
                strA = Class.class.getName() + '[' + this.f416134a.getName() + ']';
            }
            return new g(dVar, strA);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<U> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            TypeDescription typeDescription = this.f416134a;
            try {
                return new a(typeDescription.w5() ? (Class) f416133b.get(typeDescription) : Class.forName(typeDescription.getName(), false, classLoader));
            } catch (ClassNotFoundException e12) {
                return new h.a(typeDescription.getName(), e12);
            }
        }

        public final String toString() {
            return RenderingDispatcher.f416081e.k(this.f416134a);
        }
    }

    public interface k<U> {

        public static abstract class a<W> implements k<W> {

            /* renamed from: net.bytebuddy.description.annotation.AnnotationValue$k$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC11966a<Z> extends a<Z> {
                @Override // net.bytebuddy.description.annotation.AnnotationValue.k
                public final boolean c(Object obj) {
                    return false;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.k
                public final State getState() {
                    return State.f416103c;
                }
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final <X> X b(Class<? extends X> cls) {
                return cls.cast(a());
            }
        }

        U a();

        <V> V b(Class<? extends V> cls);

        boolean c(Object obj);

        State getState();
    }

    T a();

    <W> W b(Class<? extends W> cls);

    State getState();

    Sort o();

    AnnotationValue<T, S> p(a.d dVar, TypeDefinition typeDefinition);

    AnnotationValue<T, S> q(a.d dVar);

    k<S> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader);

    public static class ForConstant<U> extends b<U, U> {

        /* renamed from: a, reason: collision with root package name */
        public final U f416055a;

        /* renamed from: b, reason: collision with root package name */
        public final PropertyDelegate f416056b;

        /* renamed from: c, reason: collision with root package name */
        public transient /* synthetic */ int f416057c;

        public static class a<V> extends k.a<V> {

            /* renamed from: a, reason: collision with root package name */
            public final V f416078a;

            /* renamed from: b, reason: collision with root package name */
            public final PropertyDelegate f416079b;

            /* renamed from: c, reason: collision with root package name */
            public transient /* synthetic */ int f416080c;

            public a(V v12, PropertyDelegate propertyDelegate) {
                this.f416078a = v12;
                this.f416079b = propertyDelegate;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final V a() {
                return (V) this.f416079b.a(this.f416078a);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final boolean c(Object obj) {
                return this.f416079b.equals(this.f416078a, obj);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                if (kVar.getState().a()) {
                    if (this.f416079b.equals(this.f416078a, kVar.a())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final State getState() {
                return State.f416104d;
            }

            @k.c
            public final int hashCode() {
                int iHashCode = this.f416080c != 0 ? 0 : this.f416079b.hashCode(this.f416078a);
                if (iHashCode == 0) {
                    return this.f416080c;
                }
                this.f416080c = iHashCode;
                return iHashCode;
            }

            public final String toString() {
                return this.f416079b.b(this.f416078a);
            }
        }

        public ForConstant(U u12, PropertyDelegate propertyDelegate) {
            this.f416055a = u12;
            this.f416056b = propertyDelegate;
        }

        public static ForConstant c(Object obj) {
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return new ForConstant(bool, PropertyDelegate.ForNonArrayType.f416068b);
            }
            if (obj instanceof Byte) {
                Byte b12 = (Byte) obj;
                b12.getClass();
                return new ForConstant(b12, PropertyDelegate.ForNonArrayType.f416069c);
            }
            if (obj instanceof Short) {
                Short sh2 = (Short) obj;
                sh2.getClass();
                return new ForConstant(sh2, PropertyDelegate.ForNonArrayType.f416070d);
            }
            if (obj instanceof Character) {
                Character ch2 = (Character) obj;
                ch2.getClass();
                return new ForConstant(ch2, PropertyDelegate.ForNonArrayType.f416071e);
            }
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                num.getClass();
                return new ForConstant(num, PropertyDelegate.ForNonArrayType.f416072f);
            }
            if (obj instanceof Long) {
                Long l12 = (Long) obj;
                l12.getClass();
                return new ForConstant(l12, PropertyDelegate.ForNonArrayType.f416073g);
            }
            if (obj instanceof Float) {
                Float f12 = (Float) obj;
                f12.getClass();
                return new ForConstant(f12, PropertyDelegate.ForNonArrayType.f416074h);
            }
            if (obj instanceof Double) {
                Double d12 = (Double) obj;
                d12.getClass();
                return new ForConstant(d12, PropertyDelegate.ForNonArrayType.f416075i);
            }
            if (obj instanceof String) {
                return new ForConstant((String) obj, PropertyDelegate.ForNonArrayType.f416076j);
            }
            if (obj instanceof boolean[]) {
                return new ForConstant((boolean[]) obj, PropertyDelegate.ForArrayType.f416058b);
            }
            if (obj instanceof byte[]) {
                return new ForConstant((byte[]) obj, PropertyDelegate.ForArrayType.f416059c);
            }
            if (obj instanceof short[]) {
                return new ForConstant((short[]) obj, PropertyDelegate.ForArrayType.f416060d);
            }
            if (obj instanceof char[]) {
                return new ForConstant((char[]) obj, PropertyDelegate.ForArrayType.f416061e);
            }
            if (obj instanceof int[]) {
                return new ForConstant((int[]) obj, PropertyDelegate.ForArrayType.f416062f);
            }
            if (obj instanceof long[]) {
                return new ForConstant((long[]) obj, PropertyDelegate.ForArrayType.f416063g);
            }
            if (obj instanceof float[]) {
                return new ForConstant((float[]) obj, PropertyDelegate.ForArrayType.f416064h);
            }
            if (obj instanceof double[]) {
                return new ForConstant((double[]) obj, PropertyDelegate.ForArrayType.f416065i);
            }
            if (obj instanceof String[]) {
                return new ForConstant((String[]) obj, PropertyDelegate.ForArrayType.f416066j);
            }
            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "Not a constant annotation value: "));
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final U a() {
            return this.f416055a;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this != obj) {
                if (obj instanceof AnnotationValue) {
                    if (this.f416056b.equals(this.f416055a, ((AnnotationValue) obj).a())) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416104d;
        }

        @k.c
        public final int hashCode() {
            int iHashCode = this.f416057c != 0 ? 0 : this.f416056b.hashCode(this.f416055a);
            if (iHashCode == 0) {
                return this.f416057c;
            }
            this.f416057c = iHashCode;
            return iHashCode;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.a(TypeDescription.d.A0(this.f416055a.getClass()).Z1());
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<U, U> p(a.d dVar, TypeDefinition typeDefinition) {
            TypeDescription typeDescriptionH3 = typeDefinition.f5().h3();
            Object obj = this.f416055a;
            if (typeDescriptionH3.Q2(obj.getClass())) {
                return this;
            }
            if (obj.getClass().isArray()) {
                return new g(dVar, RenderingDispatcher.f416081e.a(Sort.a(TypeDescription.d.A0(obj.getClass().getComponentType()))));
            }
            if (obj instanceof Enum) {
                return new g(dVar, obj.getClass().getName() + '.' + ((Enum) obj).name());
            }
            return new g(dVar, RenderingDispatcher.f416081e.l(obj.getClass()) + '[' + obj + ']');
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<U> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            return new a(this.f416055a, this.f416056b);
        }

        public final String toString() {
            return this.f416056b.b(this.f416055a);
        }

        public interface PropertyDelegate {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class ForArrayType implements PropertyDelegate {

                /* renamed from: b, reason: collision with root package name */
                public static final ForArrayType f416058b;

                /* renamed from: c, reason: collision with root package name */
                public static final ForArrayType f416059c;

                /* renamed from: d, reason: collision with root package name */
                public static final ForArrayType f416060d;

                /* renamed from: e, reason: collision with root package name */
                public static final ForArrayType f416061e;

                /* renamed from: f, reason: collision with root package name */
                public static final ForArrayType f416062f;

                /* renamed from: g, reason: collision with root package name */
                public static final ForArrayType f416063g;

                /* renamed from: h, reason: collision with root package name */
                public static final ForArrayType f416064h;

                /* renamed from: i, reason: collision with root package name */
                public static final ForArrayType f416065i;

                /* renamed from: j, reason: collision with root package name */
                public static final ForArrayType f416066j;

                /* renamed from: k, reason: collision with root package name */
                public static final /* synthetic */ ForArrayType[] f416067k;

                public enum a extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((boolean[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.a) ForNonArrayType.f416068b).b(Boolean.valueOf(Array.getBoolean(obj, i12)));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof boolean[]) && Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((boolean[]) obj);
                    }
                }

                public enum b extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((byte[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.b) ForNonArrayType.f416069c).b(Byte.valueOf(Array.getByte(obj, i12)));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof byte[]) && Arrays.equals((byte[]) obj, (byte[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((byte[]) obj);
                    }
                }

                public enum c extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((short[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.c) ForNonArrayType.f416070d).b(Short.valueOf(Array.getShort(obj, i12)));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof short[]) && Arrays.equals((short[]) obj, (short[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((short[]) obj);
                    }
                }

                public enum d extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((char[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.d) ForNonArrayType.f416071e).b(Character.valueOf(Array.getChar(obj, i12)));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof char[]) && Arrays.equals((char[]) obj, (char[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((char[]) obj);
                    }
                }

                public enum e extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((int[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.e) ForNonArrayType.f416072f).b(Integer.valueOf(Array.getInt(obj, i12)));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof int[]) && Arrays.equals((int[]) obj, (int[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((int[]) obj);
                    }
                }

                public enum f extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((long[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.f) ForNonArrayType.f416073g).b(Long.valueOf(Array.getLong(obj, i12)));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof long[]) && Arrays.equals((long[]) obj, (long[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((long[]) obj);
                    }
                }

                public enum g extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((float[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.g) ForNonArrayType.f416074h).b(Float.valueOf(Array.getFloat(obj, i12)));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof float[]) && Arrays.equals((float[]) obj, (float[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((float[]) obj);
                    }
                }

                public enum h extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((double[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.h) ForNonArrayType.f416075i).b(Double.valueOf(Array.getDouble(obj, i12)));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof double[]) && Arrays.equals((double[]) obj, (double[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((double[]) obj);
                    }
                }

                public enum i extends ForArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final Object c(Object obj) {
                        return ((String[]) obj).clone();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate.ForArrayType
                    public final String d(int i12, Object obj) {
                        return ((ForNonArrayType.i) ForNonArrayType.f416076j).b(Array.get(obj, i12));
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final boolean equals(Object obj, Object obj2) {
                        return (obj2 instanceof String[]) && Arrays.equals((String[]) obj, (String[]) obj2);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final int hashCode(Object obj) {
                        return Arrays.hashCode((String[]) obj);
                    }
                }

                static {
                    a aVar = new a("BOOLEAN", 0, null);
                    f416058b = aVar;
                    b bVar = new b("BYTE", 1, null);
                    f416059c = bVar;
                    c cVar = new c("SHORT", 2, null);
                    f416060d = cVar;
                    d dVar = new d("CHARACTER", 3, null);
                    f416061e = dVar;
                    e eVar = new e("INTEGER", 4, null);
                    f416062f = eVar;
                    f fVar = new f("LONG", 5, null);
                    f416063g = fVar;
                    g gVar = new g("FLOAT", 6, null);
                    f416064h = gVar;
                    h hVar = new h("DOUBLE", 7, null);
                    f416065i = hVar;
                    i iVar = new i("STRING", 8, null);
                    f416066j = iVar;
                    f416067k = new ForArrayType[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar};
                }

                public ForArrayType() {
                    throw null;
                }

                public ForArrayType(String str, int i12, a aVar) {
                }

                public static ForArrayType valueOf(String str) {
                    return (ForArrayType) Enum.valueOf(ForArrayType.class, str);
                }

                public static ForArrayType[] values() {
                    return (ForArrayType[]) f416067k.clone();
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public final <S> S a(S s5) {
                    return (S) c(s5);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public final String b(Object obj) {
                    ArrayList arrayList = new ArrayList(Array.getLength(obj));
                    for (int i12 = 0; i12 < Array.getLength(obj); i12++) {
                        arrayList.add(d(i12, obj));
                    }
                    return RenderingDispatcher.f416081e.i(arrayList);
                }

                public abstract Object c(Object obj);

                public abstract String d(int i12, Object obj);
            }

            <S> S a(S s5);

            String b(Object obj);

            boolean equals(Object obj, Object obj2);

            int hashCode(Object obj);

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class ForNonArrayType implements PropertyDelegate {

                /* renamed from: b, reason: collision with root package name */
                public static final ForNonArrayType f416068b;

                /* renamed from: c, reason: collision with root package name */
                public static final ForNonArrayType f416069c;

                /* renamed from: d, reason: collision with root package name */
                public static final ForNonArrayType f416070d;

                /* renamed from: e, reason: collision with root package name */
                public static final ForNonArrayType f416071e;

                /* renamed from: f, reason: collision with root package name */
                public static final ForNonArrayType f416072f;

                /* renamed from: g, reason: collision with root package name */
                public static final ForNonArrayType f416073g;

                /* renamed from: h, reason: collision with root package name */
                public static final ForNonArrayType f416074h;

                /* renamed from: i, reason: collision with root package name */
                public static final ForNonArrayType f416075i;

                /* renamed from: j, reason: collision with root package name */
                public static final ForNonArrayType f416076j;

                /* renamed from: k, reason: collision with root package name */
                public static final /* synthetic */ ForNonArrayType[] f416077k;

                public enum a extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        RenderingDispatcher renderingDispatcher = RenderingDispatcher.f416081e;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        renderingDispatcher.getClass();
                        return Boolean.toString(zBooleanValue);
                    }
                }

                public enum b extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        return RenderingDispatcher.f416081e.b(((Byte) obj).byteValue());
                    }
                }

                public enum c extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        RenderingDispatcher renderingDispatcher = RenderingDispatcher.f416081e;
                        short sShortValue = ((Short) obj).shortValue();
                        renderingDispatcher.getClass();
                        return Short.toString(sShortValue);
                    }
                }

                public enum d extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        return RenderingDispatcher.f416081e.c(((Character) obj).charValue());
                    }
                }

                public enum e extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        RenderingDispatcher renderingDispatcher = RenderingDispatcher.f416081e;
                        int iIntValue = ((Integer) obj).intValue();
                        renderingDispatcher.getClass();
                        return Integer.toString(iIntValue);
                    }
                }

                public enum f extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        return RenderingDispatcher.f416081e.f(((Long) obj).longValue());
                    }
                }

                public enum g extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        return RenderingDispatcher.f416081e.e(((Float) obj).floatValue());
                    }
                }

                public enum h extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        return RenderingDispatcher.f416081e.d(((Double) obj).doubleValue());
                    }
                }

                public enum i extends ForNonArrayType {
                    @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                    public final String b(Object obj) {
                        return RenderingDispatcher.f416081e.h((String) obj);
                    }
                }

                static {
                    a aVar = new a("BOOLEAN", 0, null);
                    f416068b = aVar;
                    b bVar = new b("BYTE", 1, null);
                    f416069c = bVar;
                    c cVar = new c("SHORT", 2, null);
                    f416070d = cVar;
                    d dVar = new d("CHARACTER", 3, null);
                    f416071e = dVar;
                    e eVar = new e("INTEGER", 4, null);
                    f416072f = eVar;
                    f fVar = new f("LONG", 5, null);
                    f416073g = fVar;
                    g gVar = new g("FLOAT", 6, null);
                    f416074h = gVar;
                    h hVar = new h("DOUBLE", 7, null);
                    f416075i = hVar;
                    i iVar = new i("STRING", 8, null);
                    f416076j = iVar;
                    f416077k = new ForNonArrayType[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar};
                }

                public ForNonArrayType() {
                    throw null;
                }

                public ForNonArrayType(String str, int i12, a aVar) {
                }

                public static ForNonArrayType valueOf(String str) {
                    return (ForNonArrayType) Enum.valueOf(ForNonArrayType.class, str);
                }

                public static ForNonArrayType[] values() {
                    return (ForNonArrayType[]) f416077k.clone();
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public final boolean equals(Object obj, Object obj2) {
                    return obj.equals(obj2);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public final int hashCode(Object obj) {
                    return obj.hashCode();
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.ForConstant.PropertyDelegate
                public final <S> S a(S s5) {
                    return s5;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class RenderingDispatcher {

        /* renamed from: e, reason: collision with root package name */
        public static final RenderingDispatcher f416081e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ RenderingDispatcher[] f416082f;

        /* renamed from: b, reason: collision with root package name */
        public final char f416083b;

        /* renamed from: c, reason: collision with root package name */
        public final char f416084c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f416085d;

        public enum b extends RenderingDispatcher {
            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String c(char c12) {
                StringBuilder sb2 = new StringBuilder("'");
                if (c12 == '\'') {
                    sb2.append("\\'");
                } else {
                    sb2.append(c12);
                }
                sb2.append('\'');
                return sb2.toString();
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String d(double d12) {
                return Math.abs(d12) <= Double.MAX_VALUE ? Double.toString(d12) : Double.isInfinite(d12) ? d12 < 0.0d ? "-1.0/0.0" : "1.0/0.0" : "0.0/0.0";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String e(float f12) {
                if (Math.abs(f12) > Float.MAX_VALUE) {
                    return Float.isInfinite(f12) ? f12 < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f" : "0.0f/0.0f";
                }
                return f12 + "f";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String f(long j12) {
                if (Math.abs(j12) <= 2147483647L) {
                    return String.valueOf(j12);
                }
                return j12 + "L";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String h(String str) {
                StringBuilder sb2 = new StringBuilder("\"");
                if (str.indexOf(34) != -1) {
                    str = str.replace("\"", "\\\"");
                }
                return AK.c.s(sb2, str, "\"");
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String k(TypeDescription typeDescription) {
                return typeDescription.R() + ".class";
            }
        }

        public enum c extends RenderingDispatcher {
            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String b(byte b12) {
                return r.m(b12 & 255, new StringBuilder("(byte)0x"));
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String c(char c12) {
                StringBuilder sb2 = new StringBuilder("'");
                if (c12 == '\'') {
                    sb2.append("\\'");
                } else {
                    sb2.append(c12);
                }
                sb2.append('\'');
                return sb2.toString();
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String d(double d12) {
                return Math.abs(d12) <= Double.MAX_VALUE ? Double.toString(d12) : Double.isInfinite(d12) ? d12 < 0.0d ? "-1.0/0.0" : "1.0/0.0" : "0.0/0.0";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String e(float f12) {
                if (Math.abs(f12) > Float.MAX_VALUE) {
                    return Float.isInfinite(f12) ? f12 < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f" : "0.0f/0.0f";
                }
                return f12 + "f";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String f(long j12) {
                return j12 + "L";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String h(String str) {
                StringBuilder sb2 = new StringBuilder("\"");
                if (str.indexOf(34) != -1) {
                    str = str.replace("\"", "\\\"");
                }
                return AK.c.s(sb2, str, "\"");
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String k(TypeDescription typeDescription) {
                return typeDescription.R() + ".class";
            }
        }

        public enum d extends RenderingDispatcher {
            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String b(byte b12) {
                return r.m(b12 & 255, new StringBuilder("(byte)0x"));
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String c(char c12) {
                StringBuilder sb2 = new StringBuilder("'");
                if (c12 == '\'') {
                    sb2.append("\\'");
                } else {
                    sb2.append(c12);
                }
                sb2.append('\'');
                return sb2.toString();
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String d(double d12) {
                return Math.abs(d12) <= Double.MAX_VALUE ? Double.toString(d12) : Double.isInfinite(d12) ? d12 < 0.0d ? "-1.0/0.0" : "1.0/0.0" : "0.0/0.0";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String e(float f12) {
                if (Math.abs(f12) > Float.MAX_VALUE) {
                    return Float.isInfinite(f12) ? f12 < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f" : "0.0f/0.0f";
                }
                return f12 + "f";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String f(long j12) {
                return j12 + "L";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String h(String str) {
                StringBuilder sb2 = new StringBuilder("\"");
                if (str.indexOf(34) != -1) {
                    str = str.replace("\"", "\\\"");
                }
                return AK.c.s(sb2, str, "\"");
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String k(TypeDescription typeDescription) {
                return typeDescription.R() + ".class";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String l(Class<?> cls) {
                return cls.getName();
            }
        }

        public enum e extends RenderingDispatcher {
            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String b(byte b12) {
                return r.m(b12 & 255, new StringBuilder("(byte)0x"));
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String c(char c12) {
                StringBuilder sb2 = new StringBuilder("'");
                if (c12 == '\'') {
                    sb2.append("\\'");
                } else {
                    sb2.append(c12);
                }
                sb2.append('\'');
                return sb2.toString();
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String d(double d12) {
                return Math.abs(d12) <= Double.MAX_VALUE ? Double.toString(d12) : Double.isInfinite(d12) ? d12 < 0.0d ? "-1.0/0.0" : "1.0/0.0" : "0.0/0.0";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String e(float f12) {
                if (Math.abs(f12) > Float.MAX_VALUE) {
                    return Float.isInfinite(f12) ? f12 < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f" : "0.0f/0.0f";
                }
                return f12 + "f";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String f(long j12) {
                return j12 + "L";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String h(String str) {
                StringBuilder sb2 = new StringBuilder("\"");
                if (str.indexOf(34) != -1) {
                    str = str.replace("\"", "\\\"");
                }
                return AK.c.s(sb2, str, "\"");
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String k(TypeDescription typeDescription) {
                return typeDescription.s5() + ".class";
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String l(Class<?> cls) {
                return cls.getName();
            }
        }

        static {
            a aVar = new a("LEGACY_VM", 0, '[', ']', true, null);
            b bVar = new b("JAVA_9_CAPABLE_VM", 1, '{', '}', true, null);
            c cVar = new c("JAVA_14_CAPABLE_VM", 2, '{', '}', true, null);
            d dVar = new d("JAVA_17_CAPABLE_VM", 3, '{', '}', false, null);
            ClassFileVersion classFileVersion = ClassFileVersion.f415295g;
            ClassFileVersion classFileVersionH = ClassFileVersion.h(classFileVersion);
            ClassFileVersion classFileVersion2 = ClassFileVersion.f415307s;
            e eVar = new e("JAVA_19_CAPABLE_VM", 4, '{', '}', classFileVersionH.d(classFileVersion2), null);
            f416082f = new RenderingDispatcher[]{aVar, bVar, cVar, dVar, eVar};
            ClassFileVersion classFileVersionH2 = ClassFileVersion.h(classFileVersion);
            if (classFileVersionH2.c(ClassFileVersion.f415309u)) {
                f416081e = eVar;
                return;
            }
            if (classFileVersionH2.c(classFileVersion2)) {
                f416081e = dVar;
                return;
            }
            if (classFileVersionH2.c(ClassFileVersion.f415304p)) {
                f416081e = cVar;
            } else if (classFileVersionH2.c(ClassFileVersion.f415299k)) {
                f416081e = bVar;
            } else {
                f416081e = aVar;
            }
        }

        public RenderingDispatcher() {
            throw null;
        }

        public RenderingDispatcher(String str, int i12, char c12, char c13, boolean z12, a aVar) {
            this.f416083b = c12;
            this.f416084c = c13;
            this.f416085d = z12;
        }

        public static RenderingDispatcher valueOf(String str) {
            return (RenderingDispatcher) Enum.valueOf(RenderingDispatcher.class, str);
        }

        public static RenderingDispatcher[] values() {
            return (RenderingDispatcher[]) f416082f.clone();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String a(net.bytebuddy.description.annotation.AnnotationValue.Sort r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Array with component tag: "
                r0.<init>(r1)
                boolean r1 = r2.f416085d
                if (r1 != 0) goto L1a
                r3.getClass()
                net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                if (r3 == r1) goto L1a
                int r3 = r3.f416101b
                char r3 = (char) r3
                java.lang.String r3 = java.lang.Character.toString(r3)
                goto L20
            L1a:
                int r3 = r3.f416101b
                java.lang.String r3 = java.lang.Integer.toString(r3)
            L20:
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.a(net.bytebuddy.description.annotation.AnnotationValue$Sort):java.lang.String");
        }

        public String b(byte b12) {
            return Byte.toString(b12);
        }

        public abstract String c(char c12);

        public abstract String d(double d12);

        public abstract String e(float f12);

        public abstract String f(long j12);

        public abstract String h(String str);

        public final String i(List<?> list) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f416083b);
            boolean z12 = true;
            for (Object obj : list) {
                if (z12) {
                    z12 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(obj);
            }
            sb2.append(this.f416084c);
            return sb2.toString();
        }

        public abstract String k(TypeDescription typeDescription);

        public String l(Class<?> cls) {
            return cls.toString();
        }

        public enum a extends RenderingDispatcher {
            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String c(char c12) {
                return Character.toString(c12);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String d(double d12) {
                return Double.toString(d12);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String e(float f12) {
                return Float.toString(f12);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String f(long j12) {
                return Long.toString(j12);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String k(TypeDescription typeDescription) {
                return typeDescription.toString();
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher
            public final String h(String str) {
                return str;
            }
        }
    }

    public static class e<U extends Enum<U>> extends b<net.bytebuddy.description.enumeration.a, U> {

        /* renamed from: a, reason: collision with root package name */
        public final net.bytebuddy.description.enumeration.a f416115a;

        public static class a<V extends Enum<V>> extends k.a<V> {

            /* renamed from: a, reason: collision with root package name */
            public final V f416116a;

            /* renamed from: net.bytebuddy.description.annotation.AnnotationValue$e$a$a, reason: collision with other inner class name */
            public static class C11965a extends k.a<Enum<?>> {
                @Override // net.bytebuddy.description.annotation.AnnotationValue.k
                public final Object a() {
                    throw null;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.k
                public final boolean c(Object obj) {
                    return false;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.k
                public final State getState() {
                    return State.f416103c;
                }
            }

            public a(V v12) {
                this.f416116a = v12;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final Object a() {
                return this.f416116a;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final boolean c(Object obj) {
                return this.f416116a.equals(obj);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return kVar.getState().a() && this.f416116a.equals(kVar.a());
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final State getState() {
                return State.f416104d;
            }

            public final int hashCode() {
                return this.f416116a.hashCode();
            }

            public final String toString() {
                return this.f416116a.toString();
            }
        }

        public e(net.bytebuddy.description.enumeration.a aVar) {
            this.f416115a = aVar;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Object a() {
            return this.f416115a;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this != obj) {
                if (obj instanceof AnnotationValue) {
                    if (this.f416115a.equals(((AnnotationValue) obj).a())) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416104d;
        }

        public final int hashCode() {
            return this.f416115a.hashCode();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.ENUMERATION;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<net.bytebuddy.description.enumeration.a, U> p(a.d dVar, TypeDefinition typeDefinition) {
            String strA;
            TypeDescription typeDescriptionF5 = typeDefinition.f5();
            net.bytebuddy.description.enumeration.a aVar = this.f416115a;
            if (typeDescriptionF5.equals(aVar.w())) {
                return this;
            }
            if (dVar.getReturnType().w2()) {
                strA = RenderingDispatcher.f416081e.a(Sort.ENUMERATION);
            } else {
                strA = aVar.w().getName() + '.' + aVar.getValue();
            }
            return new g(dVar, strA);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<U> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            net.bytebuddy.description.enumeration.a aVar = this.f416115a;
            try {
                return new a(aVar.a0(Class.forName(aVar.w().getName(), false, classLoader)));
            } catch (ClassNotFoundException e12) {
                return new h.a(aVar.w().getName(), e12);
            }
        }

        public final String toString() {
            return this.f416115a.toString();
        }

        public static class b<U extends Enum<U>> extends b<net.bytebuddy.description.enumeration.a, U> {

            /* renamed from: a, reason: collision with root package name */
            public final TypeDescription f416117a;

            /* renamed from: b, reason: collision with root package name */
            public final String f416118b;

            public static class a extends k.a.AbstractC11966a<Enum<?>> {

                /* renamed from: a, reason: collision with root package name */
                public final Class<? extends Enum<?>> f416119a;

                /* renamed from: b, reason: collision with root package name */
                public final String f416120b;

                public a(Class<? extends Enum<?>> cls, String str) {
                    this.f416119a = cls;
                    this.f416120b = str;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue.k
                public final Object a() {
                    throw new EnumConstantNotPresentException(this.f416119a, this.f416120b);
                }

                public final String toString() {
                    return AK.c.s(new StringBuilder(), this.f416120b, " /* Warning: constant not present! */");
                }
            }

            public b(String str, TypeDescription typeDescription) {
                this.f416117a = typeDescription;
                this.f416118b = str;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public final Object a() {
                throw new IllegalStateException(this.f416117a + " does not declare enumeration constant " + this.f416118b);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public final State getState() {
                return State.f416103c;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public final Sort o() {
                return Sort.NONE;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public final k<U> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
                TypeDescription typeDescription = this.f416117a;
                try {
                    return new a(Class.forName(typeDescription.getName(), false, classLoader), this.f416118b);
                } catch (ClassNotFoundException e12) {
                    return new h.a(typeDescription.getName(), e12);
                }
            }

            public final String toString() {
                return AK.c.s(new StringBuilder(), this.f416118b, " /* Warning: constant not present! */");
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue
            public final AnnotationValue<net.bytebuddy.description.enumeration.a, U> p(a.d dVar, TypeDefinition typeDefinition) {
                return this;
            }
        }
    }

    public static class f<U, V> extends b<U, V> {

        public static class a<W> extends k.a.AbstractC11966a<W> {

            /* renamed from: a, reason: collision with root package name */
            public final Class<?> f416121a;

            public a(Class<?> cls) {
                this.f416121a = cls;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final W a() {
                throw new IncompatibleClassChangeError(this.f416121a.toString());
            }

            public final String toString() {
                return C0.f(this.f416121a, new StringBuilder("/* Warning type incompatibility! \""), "\" */");
            }
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final U a() {
            throw new IllegalStateException("Property is defined with an incompatible runtime type: null");
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416103c;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.NONE;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<V> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            throw null;
        }

        public final String toString() {
            throw null;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<U, V> p(a.d dVar, TypeDefinition typeDefinition) {
            return this;
        }
    }

    public static class h<U, V> extends b<U, V> {

        /* renamed from: a, reason: collision with root package name */
        public final String f416126a;

        public static class a<U> extends k.a.AbstractC11966a<U> {

            /* renamed from: a, reason: collision with root package name */
            public final String f416127a;

            /* renamed from: b, reason: collision with root package name */
            public final ClassNotFoundException f416128b;

            public a(String str, ClassNotFoundException classNotFoundException) {
                this.f416127a = str;
                this.f416128b = classNotFoundException;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final U a() {
                throw new TypeNotPresentException(this.f416127a, this.f416128b);
            }

            public final String toString() {
                return AK.c.s(new StringBuilder(), this.f416127a, ".class /* Warning: type not present! */");
            }
        }

        public h(String str) {
            this.f416126a = str;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final U a() {
            throw new IllegalStateException("Type not found: " + this.f416126a);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416103c;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.NONE;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<V> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            String str = this.f416126a;
            return new a(str, new ClassNotFoundException(str));
        }

        public final String toString() {
            return AK.c.s(new StringBuilder(), this.f416126a, ".class /* Warning: type not present! */");
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<U, V> p(a.d dVar, TypeDefinition typeDefinition) {
            return this;
        }
    }

    public static class i<U, V> extends b<U, V> {

        /* renamed from: a, reason: collision with root package name */
        public final TypeDescription f416129a;

        /* renamed from: b, reason: collision with root package name */
        public final String f416130b;

        public static class a<W> extends k.a<W> {

            /* renamed from: a, reason: collision with root package name */
            public final Class<? extends Annotation> f416131a;

            /* renamed from: b, reason: collision with root package name */
            public final String f416132b;

            public a(Class<? extends Annotation> cls, String str) {
                this.f416131a = cls;
                this.f416132b = str;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final W a() {
                throw new IncompleteAnnotationException(this.f416131a, this.f416132b);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final boolean c(Object obj) {
                return false;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationValue.k
            public final State getState() {
                return State.f416102b;
            }
        }

        public i(String str, TypeDescription typeDescription) {
            this.f416129a = typeDescription;
            this.f416130b = str;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final U a() {
            throw new IllegalStateException(this.f416129a + " does not define " + this.f416130b);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final State getState() {
            return State.f416102b;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final Sort o() {
            return Sort.NONE;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final k<V> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) throws ClassNotFoundException {
            TypeDescription typeDescription = this.f416129a;
            try {
                Class<?> cls = Class.forName(typeDescription.getName(), false, classLoader);
                return cls.isAnnotation() ? new a(cls, this.f416130b) : new f.a(cls);
            } catch (ClassNotFoundException e12) {
                return new h.a(typeDescription.getName(), e12);
            }
        }

        @Override // net.bytebuddy.description.annotation.AnnotationValue
        public final AnnotationValue<U, V> p(a.d dVar, TypeDefinition typeDefinition) {
            return this;
        }
    }
}
