package androidx.compose.ui.text;

import androidx.compose.ui.text.style.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: Savers.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f42117a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f42118b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f42119c;

    /* compiled from: Savers.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/ui/text/style/f;", "it", "", "invoke-nI23V4A", "(Landroidx/compose/runtime/saveable/x;I)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, androidx.compose.ui.text.style.f, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f42120l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(androidx.compose.runtime.saveable.x xVar, androidx.compose.ui.text.style.f fVar) {
            return Integer.valueOf(fVar.f42641a);
        }
    }

    /* compiled from: Savers.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/style/f;", "invoke-8aCASmQ", "(Ljava/lang/Object;)Landroidx/compose/ui/text/style/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, androidx.compose.ui.text.style.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f42121l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final androidx.compose.ui.text.style.f invoke(Object obj) {
            return androidx.compose.ui.text.style.f.a(((Integer) obj).intValue());
        }
    }

    /* compiled from: Savers.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/ui/text/W;", "it", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/ui/text/W;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, W, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f42122l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(androidx.compose.runtime.saveable.x xVar, W w12) {
            W w13 = w12;
            Boolean boolValueOf = Boolean.valueOf(w13.f41967a);
            androidx.compose.runtime.saveable.w wVar = C22579b0.f42046a;
            return C42745f0.j(boolValueOf, C22674v.a(w13.f41968b));
        }
    }

    /* compiled from: Savers.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/W;", "invoke", "(Ljava/lang/Object;)Landroidx/compose/ui/text/W;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, W> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f42123l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final W invoke(Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            boolean zBooleanValue = (obj2 != null ? (Boolean) obj2 : null).booleanValue();
            Object obj3 = list.get(1);
            return new W((obj3 != null ? (C22674v) obj3 : null).f42733a, zBooleanValue, (C42822w) null);
        }
    }

    /* compiled from: Savers.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/ui/text/style/r;", "it", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/ui/text/style/r;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, androidx.compose.ui.text.style.r, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f42124l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(androidx.compose.runtime.saveable.x xVar, androidx.compose.ui.text.style.r rVar) {
            androidx.compose.ui.text.style.r rVar2 = rVar;
            r.b bVarA = r.b.a(rVar2.f42713a);
            androidx.compose.runtime.saveable.w wVar = C22579b0.f42046a;
            return C42745f0.j(bVarA, Boolean.valueOf(rVar2.f42714b));
        }
    }

    /* compiled from: Savers.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/style/r;", "invoke", "(Ljava/lang/Object;)Landroidx/compose/ui/text/style/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Object, androidx.compose.ui.text.style.r> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f42125l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final androidx.compose.ui.text.style.r invoke(Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            r.b bVar = obj2 != null ? (r.b) obj2 : null;
            Object obj3 = list.get(1);
            return new androidx.compose.ui.text.style.r(bVar.f42719a, (obj3 != null ? (Boolean) obj3 : null).booleanValue(), null);
        }
    }

    static {
        c cVar = c.f42122l;
        d dVar = d.f42123l;
        androidx.compose.runtime.saveable.w wVar = androidx.compose.runtime.saveable.v.f38606a;
        f42117a = new androidx.compose.runtime.saveable.w(dVar, cVar);
        f42118b = new androidx.compose.runtime.saveable.w(b.f42121l, a.f42120l);
        f42119c = new androidx.compose.runtime.saveable.w(f.f42125l, e.f42124l);
    }
}
