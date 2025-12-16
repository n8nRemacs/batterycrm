package curtains.internal;

import Y41.l;
import Y61.k;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: RootViewsSpy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcurtains/internal/f;", "", "<init>", "()V", "a", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f393008c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CopyOnWriteArrayList<curtains.h> f393009a;

    /* renamed from: b, reason: collision with root package name */
    public final b f393010b;

    /* compiled from: RootViewsSpy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcurtains/internal/f$a;", "", "<init>", "()V", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {

        /* compiled from: RootViewsSpy.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "mViews", "invoke"}, k = 3, mv = {1, 4, 1})
        /* renamed from: curtains.internal.f$a$a, reason: collision with other inner class name */
        public static final class C10998a extends N implements l<ArrayList<View>, ArrayList<View>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ f f393011l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10998a(f fVar) {
                super(1);
                this.f393011l = fVar;
            }

            @Override // Y41.l
            public final ArrayList<View> invoke(ArrayList<View> arrayList) {
                b bVar = this.f393011l.f393010b;
                bVar.addAll(arrayList);
                return bVar;
            }
        }

        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.C] */
        @k
        public static f a() {
            Field field;
            f fVar = new f(null);
            i iVar = i.f393021d;
            C10998a c10998a = new C10998a(fVar);
            iVar.getClass();
            try {
                Object value = i.f393019b.getValue();
                if (value != null && (field = (Field) i.f393020c.getValue()) != null) {
                    Object obj = field.get(value);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
                    }
                    field.set(value, c10998a.invoke((ArrayList) obj));
                }
            } catch (Throwable unused) {
            }
            return fVar;
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public f() {
        this.f393009a = new CopyOnWriteArrayList<>();
        this.f393010b = new b();
    }

    /* compiled from: RootViewsSpy.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"curtains/internal/f$b", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class b extends ArrayList<View> {
        public b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            View view = (View) obj;
            Iterator<curtains.h> it = f.this.f393009a.iterator();
            while (it.hasNext()) {
                it.next().a(view, true);
            }
            return super.add(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return super.contains((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return super.indexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return super.lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return super.remove((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final Object remove(int i12) {
            View view = (View) super.remove(i12);
            Iterator<curtains.h> it = f.this.f393009a.iterator();
            while (it.hasNext()) {
                it.next().a(view, false);
            }
            return view;
        }
    }

    public /* synthetic */ f(C42822w c42822w) {
        this();
    }
}
