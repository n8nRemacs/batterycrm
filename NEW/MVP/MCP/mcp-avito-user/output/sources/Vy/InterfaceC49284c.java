package vY;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MasterPlanOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LvY/c;", "", "a", "b", "c", "LvY/c$a;", "LvY/c$b;", "LvY/c$c;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49284c {

    /* compiled from: MasterPlanOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvY/c$a;", "LvY/c;", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vY.c$a */
    public static final class a implements InterfaceC49284c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440836a = new a();
    }

    /* compiled from: MasterPlanOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvY/c$b;", "LvY/c;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vY.c$b */
    public static final class b implements InterfaceC49284c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440837a;

        public b(@k DeepLink deepLink) {
            this.f440837a = deepLink;
        }
    }

    /* compiled from: MasterPlanOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvY/c$c;", "LvY/c;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vY.c$c, reason: collision with other inner class name */
    public static final class C12780c implements InterfaceC49284c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f440838a;

        /* JADX WARN: Multi-variable type inference failed */
        public C12780c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public C12780c(@l String str) {
            this.f440838a = str;
        }

        public /* synthetic */ C12780c(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }
}
