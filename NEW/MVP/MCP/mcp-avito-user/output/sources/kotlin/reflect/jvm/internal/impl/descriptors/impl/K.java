package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: PropertyAccessorDescriptorImpl.java */
/* loaded from: classes8.dex */
public abstract class K extends AbstractC42871o implements kotlin.reflect.jvm.internal.impl.descriptors.T {

    /* renamed from: f, reason: collision with root package name */
    public boolean f407574f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f407575g;

    /* renamed from: h, reason: collision with root package name */
    public final Modality f407576h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.U f407577i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f407578j;

    /* renamed from: k, reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f407579k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC42900s f407580l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public InterfaceC42905x f407581m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(@Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z12, boolean z13, boolean z14, CallableMemberDescriptor.Kind kind, @Y61.k b0 b0Var) {
        super(u12.f(), gVar, fVar, b0Var);
        if (modality == null) {
            L(0);
            throw null;
        }
        if (abstractC42900s == null) {
            L(1);
            throw null;
        }
        if (gVar == null) {
            L(3);
            throw null;
        }
        if (b0Var == null) {
            L(5);
            throw null;
        }
        this.f407581m = null;
        this.f407576h = modality;
        this.f407580l = abstractC42900s;
        this.f407577i = u12;
        this.f407574f = z12;
        this.f407575g = z13;
        this.f407578j = z14;
        this.f407579k = kind;
    }

    public static /* synthetic */ void L(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i13 = 2;
                break;
            case 7:
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i12) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i12) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    @Y61.l
    public final InterfaceC42905x A0() {
        return this.f407581m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.X F() {
        return s0().F();
    }

    @Y61.k
    public final ArrayList F0(boolean z12) {
        ArrayList arrayList = new ArrayList(0);
        Iterator<? extends CallableMemberDescriptor> it = s0().p().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.U u12 = (kotlin.reflect.jvm.internal.impl.descriptors.U) it.next();
            InterfaceC42883l getter = z12 ? u12.getGetter() : u12.c();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.X H() {
        return s0().H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public final boolean K() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.X> T() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.X> listT = s0().T();
        if (listT != null) {
            return listT;
        }
        L(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @Y61.k
    /* renamed from: V */
    public final CallableMemberDescriptor n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean Z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Y61.k
    public final InterfaceC42905x b(@Y61.k E0 e02) {
        if (e02 != null) {
            return this;
        }
        L(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @Y61.k
    public final CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f407579k;
        if (kind != null) {
            return kind;
        }
        L(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<g0> getTypeParameters() {
        List<g0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        L(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        AbstractC42900s abstractC42900s = this.f407580l;
        if (abstractC42900s != null) {
            return abstractC42900s;
        }
        L(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final Modality i() {
        Modality modality = this.f407576h;
        if (modality != null) {
            return modality;
        }
        L(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return this.f407575g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isInline() {
        return this.f407578j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void l0(@Y61.k Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            return;
        }
        L(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.T n0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.T
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.U s0() {
        kotlin.reflect.jvm.internal.impl.descriptors.U u12 = this.f407577i;
        if (u12 != null) {
            return u12;
        }
        L(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.l
    public final <V> V x(InterfaceC42848a.InterfaceC11651a<V> interfaceC11651a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Y61.k
    public final /* bridge */ /* synthetic */ InterfaceC42883l b(@Y61.k E0 e02) {
        b(e02);
        return this;
    }
}
