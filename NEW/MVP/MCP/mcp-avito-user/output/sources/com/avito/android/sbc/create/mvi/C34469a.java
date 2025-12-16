package com.avito.android.sbc.create.mvi;

import Oo0.AbstractC14721b;
import To0.C15384a;
import To0.C15385b;
import Uo0.C15545b;
import Uo0.InterfaceC15546c;
import Uo0.e;
import Uo0.f;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import com.avito.android.C30566f2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.utils.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DiscountDispatchVasFooterActionClickedDeeplink;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.mnz_common.data.MnzFloatingFooterContacts;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sbc.create.model.ExpiresAtDto;
import com.avito.android.sbc.create.model.Offer;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import com.avito.android.sbc.generated.api.api_create_dispatch_v_1.ApiCreateDispatchV1Response;
import com.avito.android.util.O2;
import cp0.C39390a;
import cp0.C39391b;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CreateDiscountDispatchActor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/sbc/create/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LUo0/e;", "LUo0/f;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "LUo0/i;", "LUo0/j;", "a", "b", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sbc.create.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34469a implements com.avito.android.arch.mvi.a<Uo0.e, Uo0.f, CreateDiscountDispatchState>, Uo0.i, Uo0.j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H0 f259540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.a f259541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.create.c f259542c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CreateDiscountDispatchArg f259543d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.g f259544e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C30566f2 f259545f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f259546g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f259547h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Oo0.k f259548i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f259549j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f259550k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.create.mvi.util.g f259551l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final AK0.l f259552m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f259553n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final String f259554o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.utils.o f259555p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final n2<CreateDiscountDispatchState> f259556q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final e2 f259557r;

    /* compiled from: CreateDiscountDispatchActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/create/mvi/a$a;", "", "a", "b", "Lcom/avito/android/sbc/create/mvi/a$a$a;", "Lcom/avito/android/sbc/create/mvi/a$a$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC7790a {

        /* compiled from: CreateDiscountDispatchActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/create/mvi/a$a$a;", "Lcom/avito/android/sbc/create/mvi/a$a;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.sbc.create.mvi.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7791a implements InterfaceC7790a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C7791a f259558a = new C7791a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C7791a);
            }

            public final int hashCode() {
                return 1737903044;
            }

            @Y61.k
            public final String toString() {
                return "PassThrough";
            }
        }

        /* compiled from: CreateDiscountDispatchActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/create/mvi/a$a$b;", "Lcom/avito/android/sbc/create/mvi/a$a;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.sbc.create.mvi.a$a$b */
        public static final /* data */ class b implements InterfaceC7790a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f259559a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1650710719;
            }

            @Y61.k
            public final String toString() {
                return "Process";
            }
        }
    }

    /* compiled from: CreateDiscountDispatchActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/a$b;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.a$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f259560a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f259561b;

        /* renamed from: c, reason: collision with root package name */
        public final long f259562c;

        public b(long j12, long j13, @Y61.l Long l12) {
            this.f259560a = j12;
            this.f259561b = l12;
            this.f259562c = j13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f259560a == bVar.f259560a && kotlin.jvm.internal.L.f(this.f259561b, bVar.f259561b) && this.f259562c == bVar.f259562c;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f259560a) * 31;
            Long l12 = this.f259561b;
            return Long.hashCode(this.f259562c) + ((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ForecastRequestData(firstDayAudience=");
            sb2.append(this.f259560a);
            sb2.append(", budget=");
            sb2.append(this.f259561b);
            sb2.append(", ttlDays=");
            return androidx.appcompat.app.r.u(sb2, this.f259562c, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.a$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f259563a;

        static {
            int[] iArr = new int[ApiCreateDispatchV1Response.CustomApiErrorCustomError.ActionType.values().length];
            try {
                iArr[ApiCreateDispatchV1Response.CustomApiErrorCustomError.ActionType.Uri.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCreateDispatchV1Response.CustomApiErrorCustomError.ActionType.Close.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCreateDispatchV1Response.CustomApiErrorCustomError.ActionType.Update.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f259563a = iArr;
        }
    }

    @Inject
    public C34469a(@Y61.k H0 h02, @Y61.k com.avito.android.sbc.utils.a aVar, @Y61.k com.avito.android.sbc.create.c cVar, @Y61.k CreateDiscountDispatchArg createDiscountDispatchArg, @Y61.k com.avito.android.sbc.utils.g gVar, @Y61.k C30566f2 c30566f2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.R0 r02, @Y61.k Oo0.k kVar, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.sbc.create.mvi.util.g gVar2, @Y61.k AK0.l lVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f259540a = h02;
        this.f259541b = aVar;
        this.f259542c = cVar;
        this.f259543d = createDiscountDispatchArg;
        this.f259544e = gVar;
        this.f259545f = c30566f2;
        this.f259546g = interfaceC28373a;
        this.f259547h = r02;
        this.f259548i = kVar;
        this.f259549j = e12;
        this.f259550k = xVar;
        this.f259551l = gVar2;
        this.f259552m = lVar;
        this.f259553n = screenPerformanceTracker;
        this.f259554o = createDiscountDispatchArg.getF259609b();
        n.a aVar2 = com.avito.android.arch.mvi.utils.n.f92111a;
        CreateDiscountDispatchState.f259615a.getClass();
        CreateDiscountDispatchState.b bVar = CreateDiscountDispatchState.a.f259759b;
        aVar2.getClass();
        com.avito.android.arch.mvi.utils.o oVar = new com.avito.android.arch.mvi.utils.o(bVar);
        this.f259555p = oVar;
        this.f259556q = oVar.f92113b;
        this.f259557r = f2.b(0, 0, null, 7);
        C43238h c43238hA = kotlinx.coroutines.U.a(r02.a());
        C43259k.d(c43238hA, null, null, new S(this, null), 3);
        C43259k.d(c43238hA, null, null, new T(this, null), 3);
    }

    public static Long A(CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded) {
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar = discountDispatchDataLoaded.f259623c;
        if (iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) {
            return Long.valueOf(Long.parseLong(discountDispatchDataLoaded.f259640t));
        }
        if (iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) {
            return Long.valueOf(Long.parseLong(discountDispatchDataLoaded.f259641u));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.sbc.create.mvi.C34469a r47, com.avito.android.arch.mvi.utils.l r48, java.lang.String r49, kotlin.coroutines.jvm.internal.ContinuationImpl r50) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.c(com.avito.android.sbc.create.mvi.a, com.avito.android.arch.mvi.utils.l, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object d(C34469a c34469a, com.avito.android.arch.mvi.utils.l lVar, Y41.p pVar, Q q12) {
        AK0.l lVar2;
        int i12;
        c34469a.getClass();
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) lVar.getValue();
        if ((createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) && ((CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState).f259620E != null) {
            C30566f2 c30566f2 = c34469a.f259545f;
            c30566f2.getClass();
            kotlin.reflect.n<Object> nVar = C30566f2.f155067o[10];
            if (((Boolean) c30566f2.f155078l.a().invoke()).booleanValue() && (i12 = (lVar2 = c34469a.f259552m).getInt("sbc_fast_chips_onboarding_show_count_key", 0)) < 2) {
                lVar2.a(i12 + 1, "sbc_fast_chips_onboarding_show_count_key");
                Object objInvoke = pVar.invoke(f.n.f16659a, q12);
                return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.G0.f406611a;
            }
        }
        return kotlin.G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9 A[Catch: all -> 0x015b, TryCatch #6 {all -> 0x015b, blocks: (B:54:0x00f3, B:56:0x00f9, B:58:0x010b, B:60:0x012d, B:66:0x015e, B:68:0x0162, B:76:0x01a8, B:77:0x01ad), top: B:117:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e A[Catch: all -> 0x015b, TryCatch #6 {all -> 0x015b, blocks: (B:54:0x00f3, B:56:0x00f9, B:58:0x010b, B:60:0x012d, B:66:0x015e, B:68:0x0162, B:76:0x01a8, B:77:0x01ad), top: B:117:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v5, types: [Y41.p, com.avito.android.arch.mvi.utils.l, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.avito.android.sbc.create.mvi.C34469a r29, com.avito.android.arch.mvi.utils.l r30, Y41.p r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.e(com.avito.android.sbc.create.mvi.a, com.avito.android.arch.mvi.utils.l, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #3 {all -> 0x0193, blocks: (B:63:0x0138, B:65:0x013e, B:76:0x0196, B:78:0x019a, B:85:0x01e2, B:86:0x01e7), top: B:116:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196 A[Catch: all -> 0x0193, TRY_ENTER, TryCatch #3 {all -> 0x0193, blocks: (B:63:0x0138, B:65:0x013e, B:76:0x0196, B:78:0x019a, B:85:0x01e2, B:86:0x01e7), top: B:116:0x0138 }] */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.avito.android.arch.mvi.utils.l, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(com.avito.android.sbc.create.mvi.C34469a r47, com.avito.android.arch.mvi.utils.l r48, com.avito.android.deep_linking.links.DeepLink r49, Y41.p r50, kotlin.coroutines.jvm.internal.ContinuationImpl r51) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.f(com.avito.android.sbc.create.mvi.a, com.avito.android.arch.mvi.utils.l, com.avito.android.deep_linking.links.DeepLink, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018a A[Catch: all -> 0x0226, TRY_LEAVE, TryCatch #1 {all -> 0x0226, blocks: (B:71:0x0184, B:73:0x018a), top: B:133:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded] */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded] */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(com.avito.android.sbc.create.mvi.C34469a r40, com.avito.android.arch.mvi.utils.l r41, Y41.p r42, kotlin.coroutines.jvm.internal.ContinuationImpl r43) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.g(com.avito.android.sbc.create.mvi.a, com.avito.android.arch.mvi.utils.l, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final MnzFloatingFooter h(C34469a c34469a, C39391b c39391b) {
        ButtonAction buttonAction;
        c34469a.getClass();
        MnzFloatingFooterContacts mnzFloatingFooterContacts = c39391b.getBbl() != null ? new MnzFloatingFooterContacts(new MnzFloatingFooterContact((int) c39391b.getBbl().getCount(), (float) c39391b.getBbl().getProgress(), null, null, null, 28, null), c39391b.getBbl().getText()) : null;
        String emptyActionTitle = c39391b.getEmptyActionTitle();
        com.avito.android.sbc.create.mvi.util.g gVar = c34469a.f259551l;
        if (emptyActionTitle != null) {
            String emptyActionTitle2 = c39391b.getEmptyActionTitle();
            gVar.getClass();
            buttonAction = new ButtonAction(emptyActionTitle2, new DiscountDispatchVasFooterActionClickedDeeplink("finish_flow", null), "secondary", Boolean.TRUE);
        } else {
            C39390a skip = c39391b.getActions().getSkip();
            gVar.getClass();
            String title = skip.getTitle();
            DiscountDispatchVasFooterActionClickedDeeplink discountDispatchVasFooterActionClickedDeeplink = new DiscountDispatchVasFooterActionClickedDeeplink("do_not_apply", skip.getUri());
            String style = skip.getStyle();
            String str = style != null ? style : "secondary";
            Boolean isEnabled = skip.getIsEnabled();
            buttonAction = new ButtonAction(title, discountDispatchVasFooterActionClickedDeeplink, str, Boolean.valueOf(isEnabled != null ? isEnabled.booleanValue() : true));
        }
        AttributedText terms = c39391b.getTerms();
        C39390a apply = c39391b.getActions().getApply();
        gVar.getClass();
        String title2 = apply.getTitle();
        DiscountDispatchVasFooterActionClickedDeeplink discountDispatchVasFooterActionClickedDeeplink2 = new DiscountDispatchVasFooterActionClickedDeeplink("apply", apply.getUri());
        String style2 = apply.getStyle();
        if (style2 == null) {
            style2 = "primary";
        }
        Boolean isEnabled2 = apply.getIsEnabled();
        return new MnzFloatingFooter(mnzFloatingFooterContacts, terms, buttonAction, new ButtonAction(title2, discountDispatchVasFooterActionClickedDeeplink2, style2, Boolean.valueOf(isEnabled2 != null ? isEnabled2.booleanValue() : true)));
    }

    public static final void i(C34469a c34469a, com.avito.android.arch.mvi.utils.l lVar, String str) throws Resources.NotFoundException {
        String str2;
        boolean z12;
        String string;
        c34469a.getClass();
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) lVar.getValue();
        if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar = discountDispatchDataLoaded.f259623c;
            if (iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) {
                Long lZ02 = C43066x.z0(str);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a aVar = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) iVar;
                long jI2 = kotlin.ranges.s.i(lZ02 != null ? lZ02.longValue() : 0L, aVar.f259705h, aVar.f259706i);
                H0 h02 = c34469a.f259540a;
                long j12 = aVar.f259705h;
                String strB = h02.b(j12);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVarA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.h.a(discountDispatchDataLoaded.f259619D, -1, false, 7679);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.e eVarT = t(c34469a, hVarA, discountDispatchDataLoaded.f259644x, 12);
                Resources resources = h02.f259298a;
                if (lZ02 == null) {
                    string = resources.getString(R.string.messenger_create_discount_dispatch_set_discount_size);
                } else if (lZ02.longValue() < j12) {
                    string = h02.b(j12);
                } else {
                    long jLongValue = lZ02.longValue();
                    long j13 = aVar.f259706i;
                    if (jLongValue <= j13) {
                        str2 = null;
                        z12 = false;
                        String strB2 = c34469a.B(discountDispatchDataLoaded.f259635o, discountDispatchDataLoaded.f259623c, "", str, discountDispatchDataLoaded.f259644x);
                        com.avito.android.sbc.create.i.f259185a.getClass();
                        long j14 = aVar.f259708k;
                        lVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a(aVar.f259698a, aVar.f259699b, aVar.f259700c, aVar.f259701d, aVar.f259702e, z12, str2, aVar.f259705h, aVar.f259706i, strB, aVar.f259708k, j14 - ((long) Math.ceil((jI2 / 100) * j14))), 0L, false, null, strB2, null, false, null, str, false, false, null, null, null, hVarA, eVarT, null, 1339539453));
                    }
                    string = resources.getString(R.string.messenger_create_discount_dispatch_maximum_discount, h02.f259299b.b(j13));
                }
                str2 = string;
                z12 = true;
                String strB22 = c34469a.B(discountDispatchDataLoaded.f259635o, discountDispatchDataLoaded.f259623c, "", str, discountDispatchDataLoaded.f259644x);
                com.avito.android.sbc.create.i.f259185a.getClass();
                long j142 = aVar.f259708k;
                lVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a(aVar.f259698a, aVar.f259699b, aVar.f259700c, aVar.f259701d, aVar.f259702e, z12, str2, aVar.f259705h, aVar.f259706i, strB, aVar.f259708k, j142 - ((long) Math.ceil((jI2 / 100) * j142))), 0L, false, null, strB22, null, false, null, str, false, false, null, null, null, hVarA, eVarT, null, 1339539453));
            }
        }
    }

    public static final void j(C34469a c34469a, com.avito.android.arch.mvi.utils.l lVar, String str) throws Resources.NotFoundException {
        String str2;
        boolean z12;
        String string;
        c34469a.getClass();
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) lVar.getValue();
        if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar = discountDispatchDataLoaded.f259623c;
            if (iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) {
                Long lZ02 = C43066x.z0(str);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b bVar = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) iVar;
                long jI2 = kotlin.ranges.s.i(lZ02 != null ? lZ02.longValue() : 0L, bVar.f259717h, bVar.f259718i);
                H0 h02 = c34469a.f259540a;
                long j12 = bVar.f259717h;
                String strA = h02.a(j12);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVarA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.h.a(discountDispatchDataLoaded.f259619D, -1, false, 7679);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.e eVarT = t(c34469a, hVarA, discountDispatchDataLoaded.f259644x, 12);
                Resources resources = h02.f259298a;
                if (lZ02 == null) {
                    string = resources.getString(R.string.messenger_create_discount_dispatch_set_discount_size);
                } else if (lZ02.longValue() < j12) {
                    string = h02.a(j12);
                } else {
                    long jLongValue = lZ02.longValue();
                    long j13 = bVar.f259718i;
                    if (jLongValue <= j13) {
                        str2 = null;
                        z12 = false;
                        String strB = c34469a.B(discountDispatchDataLoaded.f259635o, discountDispatchDataLoaded.f259623c, str, "", discountDispatchDataLoaded.f259644x);
                        com.avito.android.sbc.create.i.f259185a.getClass();
                        long j14 = bVar.f259720k;
                        lVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b(bVar.f259710a, bVar.f259711b, bVar.f259712c, bVar.f259713d, bVar.f259714e, z12, str2, bVar.f259717h, bVar.f259718i, strA, j14, j14 - jI2), 0L, false, null, strB, null, false, str, null, false, false, null, null, null, hVarA, eVarT, null, 1340850173));
                    }
                    string = resources.getString(R.string.messenger_create_discount_dispatch_maximum_discount, h02.f259299b.a(j13));
                }
                str2 = string;
                z12 = true;
                String strB2 = c34469a.B(discountDispatchDataLoaded.f259635o, discountDispatchDataLoaded.f259623c, str, "", discountDispatchDataLoaded.f259644x);
                com.avito.android.sbc.create.i.f259185a.getClass();
                long j142 = bVar.f259720k;
                lVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b(bVar.f259710a, bVar.f259711b, bVar.f259712c, bVar.f259713d, bVar.f259714e, z12, str2, bVar.f259717h, bVar.f259718i, strA, j142, j142 - jI2), 0L, false, null, strB2, null, false, str, null, false, false, null, null, null, hVarA, eVarT, null, 1340850173));
            }
        }
    }

    public static final CreateDiscountDispatchState.d k(C34469a c34469a, ApiCreateDispatchV1Response.CustomApiErrorCustomError customApiErrorCustomError) {
        Uo0.e c12;
        c34469a.getClass();
        int i12 = c.f259563a[customApiErrorCustomError.getActionType().ordinal()];
        if (i12 == 1) {
            DeepLink actionUri = customApiErrorCustomError.getActionUri();
            c12 = actionUri != null ? new e.C(actionUri) : null;
        } else if (i12 == 2) {
            c12 = new e.t(false, 1, null);
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c12 = e.k.f16630a;
        }
        Uo0.e eVar = c12;
        if (eVar == null) {
            return c34469a.x();
        }
        c34469a.f259548i.b(new AbstractC14721b.d(customApiErrorCustomError.getErrorType()));
        return new CreateDiscountDispatchState.d(customApiErrorCustomError.getTitle(), new com.avito.android.sbc.create.mvi.util.d(customApiErrorCustomError.getDescription(), null), customApiErrorCustomError.getActionTitle(), eVar, customApiErrorCustomError.getActionPreset() == ApiCreateDispatchV1Response.CustomApiErrorCustomError.ActionPreset.Primary, customApiErrorCustomError.getErrorType());
    }

    public static final CreateDiscountDispatchState.e l(C34469a c34469a) {
        ButtonAction buttonAction;
        c34469a.f259548i.b(AbstractC14721b.e.f12533b);
        CreateDiscountDispatchArg createDiscountDispatchArg = c34469a.f259543d;
        CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs sbcVasFlowConfiguratorArgs = createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs ? (CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs) createDiscountDispatchArg : null;
        String str = sbcVasFlowConfiguratorArgs != null ? sbcVasFlowConfiguratorArgs.f259614g : null;
        com.avito.android.sbc.create.mvi.util.g gVar = c34469a.f259551l;
        if (str != null) {
            String str2 = sbcVasFlowConfiguratorArgs.f259614g;
            gVar.getClass();
            buttonAction = new ButtonAction(str2, new DiscountDispatchVasFooterActionClickedDeeplink("finish_flow", null), "secondary", Boolean.TRUE);
        } else {
            DeepLink deepLink = sbcVasFlowConfiguratorArgs != null ? sbcVasFlowConfiguratorArgs.f259613f : null;
            gVar.getClass();
            buttonAction = new ButtonAction(gVar.f259914a.f259298a.getString(R.string.messenger_create_discount_skip_vas_flow_dispatch), new DiscountDispatchVasFooterActionClickedDeeplink("skip", deepLink), "secondary", Boolean.TRUE);
        }
        gVar.getClass();
        return new CreateDiscountDispatchState.e(new MnzFloatingFooter(null, null, buttonAction, new ButtonAction(gVar.f259914a.f259298a.getString(R.string.messenger_create_discount_retry_vas_flow_dispatch), new DiscountDispatchVasFooterActionClickedDeeplink("retry", null, 2, null), "primary", Boolean.TRUE)));
    }

    public static final CreateDiscountDispatchState m(C34469a c34469a, C15384a c15384a) throws Resources.NotFoundException, NumberFormatException {
        SpannableString spannableString;
        String strA = c34469a.f259549j.a();
        String f259609b = c34469a.f259543d.getF259609b();
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = c15384a.f15877l;
        boolean zF2 = kotlin.jvm.internal.L.f(bool2, bool);
        boolean z12 = c15384a.f15878m;
        c34469a.f259546g.c(new Oo0.r(strA, f259609b, c15384a.f15866a, c15384a.f15867b, zF2 ? Boolean.valueOf(z12) : null, c34469a.C()));
        long j12 = c15384a.f15867b;
        Oo0.k kVar = c34469a.f259548i;
        if (j12 <= 0 && z12 && kotlin.jvm.internal.L.f(bool2, bool)) {
            C30566f2 c30566f2 = c34469a.f259545f;
            c30566f2.getClass();
            kotlin.reflect.n<Object> nVar = C30566f2.f155067o[6];
            if (((Boolean) c30566f2.f155074h.a().invoke()).booleanValue()) {
                CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoadedP = c34469a.p(c15384a, null);
                if (discountDispatchDataLoadedP == null) {
                    return c34469a.x();
                }
                kVar.b(AbstractC14721b.c.f12531b);
                return discountDispatchDataLoadedP;
            }
        }
        if (j12 > 0) {
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoadedP2 = c34469a.p(c15384a, null);
            if (discountDispatchDataLoadedP2 == null) {
                return c34469a.x();
            }
            kVar.b(AbstractC14721b.c.f12531b);
            return discountDispatchDataLoadedP2;
        }
        kVar.b(AbstractC14721b.a.f12529b);
        H0 h02 = c34469a.f259540a;
        String string = h02.f259298a.getString(R.string.messenger_no_discount_audience);
        C15385b c15385b = c15384a.f15876k;
        e.G g12 = new e.G(c15385b.f15883b, false, 2, null);
        AttributedText attributedText = c15385b.f15884c;
        Resources resources = h02.f259298a;
        if (attributedText != null) {
            spannableString = SpannableString.valueOf(new SpannableStringBuilder(h02.f259300c.c(h02.f259301d, attributedText)).append((CharSequence) resources.getString(R.string.messenger_no_discount_audience_description_ending)));
        } else {
            spannableString = new SpannableString(resources.getText(R.string.messenger_no_discount_audience_description));
        }
        Matcher matcher = Pattern.compile("\n\n").matcher(spannableString);
        while (matcher.find()) {
            spannableString.setSpan(new AbsoluteSizeSpan(8, true), matcher.start() + 1, matcher.end(), 33);
        }
        return new CreateDiscountDispatchState.d(string, new com.avito.android.sbc.create.mvi.util.d(spannableString, new com.avito.android.sbc.create.mvi.util.c(spannableString.length() - 45, spannableString.length(), false, true, g12)), resources.getString(R.string.messenger_close), new e.t(false, 1, null), true, "no_audience");
    }

    public static final void n(C34469a c34469a, com.avito.android.arch.mvi.utils.l lVar) {
        String str;
        c34469a.getClass();
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) lVar.getValue();
        if (createDiscountDispatchState instanceof CreateDiscountDispatchState.d) {
            str = ((CreateDiscountDispatchState.d) createDiscountDispatchState).f259785g;
        } else if (!(createDiscountDispatchState instanceof CreateDiscountDispatchState.e)) {
            return;
        } else {
            str = "vas_unknown_error";
        }
        String str2 = str;
        c34469a.f259546g.c(new Oo0.c(c34469a.f259549j.a(), c34469a.D(), c34469a.f259554o, null, null, null, str2, c34469a.C()));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.f o(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i r9, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.j r10, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.h r11, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.d r12) {
        /*
            java.util.List<To0.c> r0 = r11.f259693i
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            java.util.ArrayList r3 = r11.f259692h
            int r4 = r3.size()
            if (r4 != r1) goto L24
            java.lang.Object r4 = r3.get(r2)
            boolean r4 = r4 instanceof com.avito.android.sbc.create.model.Offer.Discount
            if (r4 == 0) goto L24
        L22:
            r3 = r2
            goto L34
        L24:
            int r4 = r3.size()
            if (r4 != r1) goto L33
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = r3 instanceof com.avito.android.sbc.create.model.Offer.DiscountPercent
            if (r3 == 0) goto L33
            goto L22
        L33:
            r3 = r1
        L34:
            boolean r4 = r9 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b
            if (r4 != 0) goto L3f
            boolean r4 = r9 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a
            if (r4 == 0) goto L3d
            goto L3f
        L3d:
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r10 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d
            if (r5 != 0) goto L4b
            boolean r10 = r10 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c
            if (r10 == 0) goto L49
            goto L4b
        L49:
            r10 = r2
            goto L4c
        L4b:
            r10 = r1
        L4c:
            r5 = 0
            long r7 = r11.f259689e
            if (r0 != 0) goto L84
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$f r0 = new com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$f
            boolean r11 = r11.f259695k
            if (r11 == 0) goto L5c
            if (r3 == 0) goto L5c
            r3 = r1
            goto L5d
        L5c:
            r3 = r2
        L5d:
            if (r11 == 0) goto L63
            if (r4 == 0) goto L63
            r4 = r1
            goto L64
        L63:
            r4 = r2
        L64:
            if (r11 == 0) goto L6a
            if (r10 == 0) goto L6a
            r10 = r1
            goto L6b
        L6a:
            r10 = r2
        L6b:
            boolean r9 = r9 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.c
            if (r9 == 0) goto L71
        L6f:
            r1 = r2
            goto L80
        L71:
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L76
            goto L6f
        L76:
            if (r12 == 0) goto L7f
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$AutoDispatchToggleState r9 = com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259648c
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$AutoDispatchToggleState r11 = r12.f259664a
            if (r11 != r9) goto L6f
            goto L80
        L7f:
            r1 = r11
        L80:
            r0.<init>(r3, r4, r10, r1)
            goto L9c
        L84:
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$f r0 = new com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$f
            boolean r9 = r9 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.c
            if (r9 == 0) goto L8c
        L8a:
            r1 = r2
            goto L99
        L8c:
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L91
            goto L8a
        L91:
            if (r12 == 0) goto L99
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$AutoDispatchToggleState r9 = com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259648c
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$AutoDispatchToggleState r11 = r12.f259664a
            if (r11 != r9) goto L8a
        L99:
            r0.<init>(r3, r4, r10, r1)
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.o(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$i, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$j, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$h, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$d):com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$f");
    }

    public static CreateDiscountDispatchState.DiscountDispatchDataLoaded.b s(CreateDiscountDispatchState.DiscountDispatchDataLoaded.b bVar, CreateDiscountDispatchState.DiscountDispatchDataLoaded.c cVar) {
        Object next;
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.b bVar2;
        List listU = C42745f0.U(3L, 7L, 10L, 14L, 20L, 30L);
        ArrayList arrayList = cVar.f259663a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC15546c interfaceC15546c = (InterfaceC15546c) it.next();
            InterfaceC15546c.b bVar3 = interfaceC15546c instanceof InterfaceC15546c.b ? (InterfaceC15546c.b) interfaceC15546c : null;
            Long lValueOf = bVar3 != null ? Long.valueOf(bVar3.f16606d) : null;
            if (lValueOf != null) {
                arrayList2.add(lValueOf);
            }
        }
        List listA0 = C42745f0.A0(C42745f0.v(O2.b(listU, arrayList2)));
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((InterfaceC15546c) next).getF16684a()) {
                break;
            }
        }
        InterfaceC15546c interfaceC15546c2 = (InterfaceC15546c) next;
        if (interfaceC15546c2 != null && (interfaceC15546c2 instanceof InterfaceC15546c.b)) {
            boolean z12 = bVar != null && bVar.f259661a;
            List list = listA0;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                long jLongValue = ((Number) it3.next()).longValue();
                arrayList3.add(new C15545b(jLongValue, jLongValue == ((InterfaceC15546c.b) interfaceC15546c2).f16606d));
            }
            return new CreateDiscountDispatchState.DiscountDispatchDataLoaded.b(z12, arrayList3);
        }
        if (bVar != null) {
            bVar2 = new CreateDiscountDispatchState.DiscountDispatchDataLoaded.b(true, bVar.f259662b);
        } else {
            List list2 = listA0;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList4.add(new C15545b(((Number) obj).longValue(), i12 == 0));
                i12 = i13;
            }
            bVar2 = new CreateDiscountDispatchState.DiscountDispatchDataLoaded.b(true, arrayList4);
        }
        return bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.e t(com.avito.android.sbc.create.mvi.C34469a r25, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.h r26, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.j r27, int r28) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.t(com.avito.android.sbc.create.mvi.a, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$h, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$j, int):com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$e");
    }

    public static To0.d u(long j12, long j13, long j14, boolean z12) {
        com.avito.android.sbc.create.mvi.util.a.f259896a.getClass();
        long jA2 = com.avito.android.sbc.create.mvi.util.a.a(j13, j12);
        return new To0.d(new To0.e(null, jA2), com.avito.android.sbc.create.mvi.util.a.a(j13, j12) * j14, z12, j12, false);
    }

    public static Long y(CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar) {
        Object next;
        Object next2;
        Iterator it = dVar.f259665b.f259663a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC15546c) next).getF16684a()) {
                break;
            }
        }
        InterfaceC15546c interfaceC15546c = (InterfaceC15546c) next;
        if (!(interfaceC15546c instanceof InterfaceC15546c.a)) {
            if (interfaceC15546c instanceof InterfaceC15546c.b) {
                return Long.valueOf(((InterfaceC15546c.b) interfaceC15546c).f16606d);
            }
            return null;
        }
        Iterator<T> it2 = dVar.f259666c.f259662b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((C15545b) next2).f16599c) {
                break;
            }
        }
        C15545b c15545b = (C15545b) next2;
        if (c15545b != null) {
            return Long.valueOf(c15545b.f16598b);
        }
        return null;
    }

    public final String B(String str, CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar, String str2, String str3, CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar) {
        String f259735c;
        String strD;
        boolean z12 = iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b;
        com.avito.android.sbc.utils.a aVar = this.f259541b;
        if (z12) {
            String str4 = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) iVar).f259712c;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b bVar = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) iVar;
            Long lZ02 = C43066x.z0(str2);
            f259735c = aVar.d(kotlin.ranges.s.i(lZ02 != null ? lZ02.longValue() : 0L, bVar.f259717h, bVar.f259718i), str4);
        } else if (iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) {
            String str5 = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) iVar).f259700c;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a aVar2 = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) iVar;
            Long lZ03 = C43066x.z0(str3);
            f259735c = aVar.c(kotlin.ranges.s.i(lZ03 != null ? lZ03.longValue() : 0L, aVar2.f259705h, aVar2.f259706i), str5);
        } else {
            if (!(iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.e ? true : iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f259735c = iVar.getF259735c();
        }
        if (kotlin.jvm.internal.L.f(jVar, CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.a.f259739a)) {
            strD = "[...]";
        } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) {
            strD = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) jVar).f259743b;
        } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) {
            strD = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar).f259749b;
        } else {
            if (!(jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            strD = this.f259544e.d(((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.b) jVar).f259740a);
        }
        return C43066x.a0(C43066x.a0(str, "{{offer_text}}", f259735c, false), "{{expires_at}}", strD, false);
    }

    public final String C() {
        CreateDiscountDispatchArg createDiscountDispatchArg = this.f259543d;
        if (createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs) {
            return ((CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs) createDiscountDispatchArg).f259612e;
        }
        if (!(createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcConfiguratorArgs)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((CreateDiscountDispatchArg.SbcConfiguratorArgs) createDiscountDispatchArg).f259608d;
        return str == null ? "unknown" : str;
    }

    public final String D() {
        CreateDiscountDispatchArg createDiscountDispatchArg = this.f259543d;
        if (createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs) {
            return "vas";
        }
        if (createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcConfiguratorArgs) {
            return "popup";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Date E(CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded) {
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar = discountDispatchDataLoaded.f259644x;
        if (kotlin.jvm.internal.L.f(jVar, CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.a.f259739a)) {
            return null;
        }
        boolean z12 = jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.b;
        com.avito.android.sbc.utils.g gVar = this.f259544e;
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar2 = discountDispatchDataLoaded.f259644x;
        if (z12) {
            return com.avito.android.sbc.utils.g.e(gVar, ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.b) jVar2).f259740a);
        }
        if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) {
            return com.avito.android.sbc.utils.g.e(gVar, ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) jVar2).f259742a);
        }
        if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) {
            return com.avito.android.sbc.utils.g.e(gVar, ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar2).f259748a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Long F(CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded) {
        Date dateE = E(discountDispatchDataLoaded);
        if (dateE != null) {
            return Long.valueOf(dateE.getTime() / 1000);
        }
        return null;
    }

    public final String G(LocalDate localDate) {
        com.avito.android.sbc.utils.g gVar = this.f259544e;
        gVar.getClass();
        Date date = new Date();
        Date dateE = com.avito.android.sbc.utils.g.e(gVar, localDate);
        int iConvert = dateE.before(date) ? 0 : ((int) TimeUnit.DAYS.convert(dateE.getTime() - date.getTime(), TimeUnit.MILLISECONDS)) + 1;
        return this.f259540a.f259298a.getQuantityString(R.plurals.messenger_create_discount_dispatch_validity_days_left, iConvert, Integer.valueOf(iConvert));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(com.avito.android.arch.mvi.utils.l r28, java.lang.String r29, java.lang.Throwable r30, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded r31, Y41.p r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.H(com.avito.android.arch.mvi.utils.l, java.lang.String, java.lang.Throwable, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(com.avito.android.arch.mvi.utils.l r25, No0.C14597a r26, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded r27, Y41.p r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.I(com.avito.android.arch.mvi.utils.l, No0.a, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final InterfaceC43160i J(@Y61.k Uo0.e eVar) {
        boolean z12 = eVar instanceof e.G;
        com.avito.android.arch.mvi.utils.o oVar = this.f259555p;
        if (z12) {
            e.G g12 = (e.G) eVar;
            return C43175k.G(new D(oVar, g12, null, g12, this));
        }
        if (eVar instanceof e.F) {
            e.F f12 = (e.F) eVar;
            return C43175k.G(new E(oVar, f12, null, this, f12));
        }
        if (eVar instanceof e.C15548b) {
            e.C15548b c15548b = (e.C15548b) eVar;
            return C43175k.G(new C34499p(oVar, c15548b, null, c15548b, this));
        }
        if (eVar instanceof e.n) {
            return C43175k.G(new C34497o(oVar, (e.n) eVar, null, this));
        }
        if (eVar instanceof e.m) {
            e.m mVar = (e.m) eVar;
            return C43175k.G(new C34501q(oVar, mVar, null, this, mVar));
        }
        if (eVar instanceof e.H) {
            return new C43210w(new f.q(((e.H) eVar).f16617a));
        }
        if (eVar instanceof e.w) {
            return C43175k.G(new B(oVar, (e.w) eVar, null, this));
        }
        if (eVar instanceof e.C15553h) {
            e.C15553h c15553h = (e.C15553h) eVar;
            return C43175k.G(new r(oVar, c15553h, null, this, c15553h));
        }
        if (eVar instanceof e.C1149e) {
            e.C1149e c1149e = (e.C1149e) eVar;
            return C43175k.G(new C34504s(oVar, c1149e, null, this, c1149e));
        }
        if (eVar instanceof e.v) {
            e.v vVar = (e.v) eVar;
            return C43175k.G(new C34493m(oVar, vVar, null, this, vVar));
        }
        boolean z13 = eVar instanceof e.k;
        com.avito.android.util.R0 r02 = this.f259547h;
        if (z13) {
            return C43175k.I(r02.a(), C43175k.G(new Q(oVar, (e.k) eVar, null, this)));
        }
        if (eVar instanceof e.u) {
            K k12 = new K(this, null);
            return C43175k.I(r02.a(), C43175k.G(new N(this.f259555p, (e.u) eVar, null, this, null, k12)));
        }
        if (eVar instanceof e.z) {
            return C43175k.G(new C34508u(oVar, (e.z) eVar, null, this));
        }
        if (eVar instanceof e.s) {
            return C43175k.G(new J(this, null));
        }
        if (eVar instanceof e.l) {
            return C43175k.I(r02.a(), C43175k.G(new C34481g(oVar, (e.l) eVar, null, this)));
        }
        if (eVar instanceof e.t) {
            e.t tVar = (e.t) eVar;
            return C43175k.G(new C(oVar, tVar, null, this, tVar));
        }
        if (eVar instanceof e.C15547a) {
            e.C15547a c15547a = (e.C15547a) eVar;
            return C43175k.I(r02.a(), C43175k.G(new N(this.f259555p, c15547a, null, this, Integer.valueOf(c15547a.f16620b), new L(this, c15547a, null))));
        }
        if (eVar instanceof e.C) {
            return new C43210w(new f.g(((e.C) eVar).f16611a));
        }
        if (eVar instanceof e.j) {
            return C43175k.G(new C34512w(oVar, this, null, this));
        }
        if (eVar instanceof e.A) {
            e.A a12 = (e.A) eVar;
            return C43175k.G(new C34495n(oVar, a12, null, a12, this));
        }
        if (eVar instanceof e.r) {
            e.r rVar = (e.r) eVar;
            return C43175k.G(new C34506t(oVar, rVar, null, this, rVar));
        }
        if (eVar instanceof e.p) {
            e.p pVar = (e.p) eVar;
            return C43175k.G(new C34483h(oVar, pVar, null, pVar, this));
        }
        if (eVar instanceof e.q) {
            e.q qVar = (e.q) eVar;
            return C43175k.G(new C34489k(oVar, qVar, null, qVar, this));
        }
        if (eVar instanceof e.o) {
            e.o oVar2 = (e.o) eVar;
            return C43175k.G(new C34491l(oVar, oVar2, null, this, oVar2));
        }
        if (eVar instanceof e.E) {
            return C43175k.G(new F(oVar, (e.E) eVar, null, this));
        }
        if (eVar instanceof e.B) {
            return C43175k.G(new G(oVar, (e.B) eVar, null));
        }
        if (eVar instanceof e.D) {
            return C43175k.G(new H(oVar, (e.D) eVar, null, this));
        }
        if (eVar instanceof e.x) {
            e.x xVar = (e.x) eVar;
            return C43175k.G(new C34487j(oVar, xVar, null, xVar, this));
        }
        if (eVar instanceof e.y) {
            return C43175k.G(new C34485i(oVar, (e.y) eVar, null, this));
        }
        if (eVar instanceof e.C15549c) {
            return C43175k.G(new I(oVar, (e.C15549c) eVar, null, this));
        }
        if (eVar instanceof e.C15554i) {
            return C43175k.G(new C34510v(oVar, this, null, this, (e.C15554i) eVar));
        }
        if (eVar instanceof e.C15550d) {
            return C43175k.G(new C34513x(oVar, (e.C15550d) eVar, null, this));
        }
        if (eVar instanceof e.C15552g) {
            return C43175k.G(new C34514y(oVar, (e.C15552g) eVar, null, this));
        }
        if (eVar instanceof e.C15551f) {
            return C43175k.G(new C34515z(oVar, (e.C15551f) eVar, null, this));
        }
        if (eVar instanceof e.I) {
            return C43175k.G(new A(oVar, (e.I) eVar, null, this));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.d K(ExpiresAtDto expiresAtDto) {
        Boolean bool;
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.d dVar = null;
        Long l12 = expiresAtDto != null ? expiresAtDto.f259186b : null;
        Long l13 = expiresAtDto != null ? expiresAtDto.f259187c : null;
        Long l14 = expiresAtDto != null ? expiresAtDto.f259188d : null;
        if (l12 != null && l13 != null && l14 != null) {
            long jLongValue = l12.longValue();
            com.avito.android.sbc.utils.g gVar = this.f259544e;
            dVar = new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.d(gVar.f(jLongValue), gVar.f(l14.longValue()), gVar.f(l13.longValue()), (expiresAtDto == null || (bool = expiresAtDto.f259189e) == null) ? false : bool.booleanValue());
        }
        return dVar;
    }

    public final CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a L(Offer.DiscountPercent discountPercent, CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVar, String str) throws NumberFormatException {
        H0 h02 = this.f259540a;
        long j12 = discountPercent.f259201f;
        String strB = h02.b(j12);
        Long l12 = hVar.f259690f;
        long jLongValue = l12.longValue();
        com.avito.android.sbc.create.i iVar = com.avito.android.sbc.create.i.f259185a;
        long jLongValue2 = l12.longValue();
        long j13 = Long.parseLong(str);
        iVar.getClass();
        long jCeil = jLongValue2 - ((long) Math.ceil((j13 / 100) * jLongValue2));
        return new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a(discountPercent.f259198c, discountPercent.f259197b, discountPercent.f259199d, discountPercent.f259200e, K(discountPercent.f259203h), false, null, j12, discountPercent.f259202g, strB, jLongValue, jCeil);
    }

    public final CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b M(Offer.Discount discount, CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVar, String str) throws NumberFormatException {
        H0 h02 = this.f259540a;
        long j12 = discount.f259194f;
        String strA = h02.a(j12);
        Long l12 = hVar.f259690f;
        long jLongValue = l12.longValue();
        com.avito.android.sbc.create.i iVar = com.avito.android.sbc.create.i.f259185a;
        long jLongValue2 = l12.longValue();
        long j13 = Long.parseLong(str);
        iVar.getClass();
        long j14 = jLongValue2 - j13;
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.d dVarK = K(discount.f259196h);
        return new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b(discount.f259191c, discount.f259190b, discount.f259192d, discount.f259193e, dVarK, false, null, j12, discount.f259195g, strA, jLongValue, j14);
    }

    public final CreateDiscountDispatchState.DiscountDispatchDataLoaded.i N(Offer offer, CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVar) {
        boolean z12 = offer instanceof Offer.Discount;
        H0 h02 = this.f259540a;
        if (z12) {
            Offer.Discount discount = (Offer.Discount) offer;
            String str = discount.f259191c;
            Offer.Discount discount2 = (Offer.Discount) offer;
            long j12 = discount2.f259194f;
            String strA = h02.a(j12);
            long jLongValue = hVar.f259690f.longValue();
            com.avito.android.sbc.create.i iVar = com.avito.android.sbc.create.i.f259185a;
            long jLongValue2 = hVar.f259690f.longValue();
            iVar.getClass();
            return new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b(str, discount.f259190b, discount.f259192d, discount.f259193e, K(discount.f259196h), false, null, j12, discount2.f259195g, strA, jLongValue, jLongValue2 - discount2.f259194f);
        }
        if (!(offer instanceof Offer.DiscountPercent)) {
            if (!(offer instanceof Offer.Text)) {
                throw new NoWhenBranchMatchedException();
            }
            Offer.Text text = (Offer.Text) offer;
            return new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.e(text.f259205c, text.f259204b, text.f259206d, text.f259207e, K(text.f259208f), hVar.f259691g);
        }
        Offer.DiscountPercent discountPercent = (Offer.DiscountPercent) offer;
        String str2 = discountPercent.f259198c;
        Offer.DiscountPercent discountPercent2 = (Offer.DiscountPercent) offer;
        long j13 = discountPercent2.f259201f;
        String strB = h02.b(j13);
        long jLongValue3 = hVar.f259690f.longValue();
        com.avito.android.sbc.create.i iVar2 = com.avito.android.sbc.create.i.f259185a;
        long jLongValue4 = hVar.f259690f.longValue();
        iVar2.getClass();
        return new CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a(str2, discountPercent.f259197b, discountPercent.f259199d, discountPercent.f259200e, K(discountPercent.f259203h), false, null, j13, discountPercent2.f259202g, strB, jLongValue3, jLongValue4 - ((long) Math.ceil((discountPercent2.f259201f / 100) * jLongValue4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded r12, java.lang.String r13, boolean r14) {
        /*
            r11 = this;
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$e r0 = r12.f259620E
            r1 = 0
            if (r0 == 0) goto L2a
            java.util.ArrayList r0 = r0.f259672a
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            r3 = r2
            Uo0.h r3 = (Uo0.h) r3
            boolean r3 = r3.getF16684a()
            if (r3 == 0) goto Lb
            goto L20
        L1f:
            r2 = r1
        L20:
            Uo0.h r2 = (Uo0.h) r2
            if (r2 == 0) goto L2a
            java.lang.String r0 = r2.getF16686c()
            r8 = r0
            goto L2b
        L2a:
            r8 = r1
        L2b:
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$h r0 = r12.f259619D
            boolean r0 = r0.f259687c
            long r2 = r12.f259622b
            if (r0 == 0) goto L3f
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$d r12 = r12.f259618C
            boolean r12 = com.avito.android.sbc.create.mvi.entity.a.a(r12)
            if (r12 == 0) goto L3f
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
        L3f:
            r7 = r1
            com.avito.android.account.E r12 = r11.f259549j
            java.lang.String r12 = r12.a()
            java.lang.String r4 = r11.D()
            java.lang.String r10 = r11.C()
            Oo0.q r0 = new Oo0.q
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.lang.String r5 = r11.f259554o
            r2 = r0
            r3 = r12
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            com.avito.android.analytics.a r12 = r11.f259546g
            r12.c(r0)
            if (r14 == 0) goto L6a
            Oo0.k r12 = r11.f259548i
            Oo0.a$b r13 = Oo0.AbstractC14720a.b.f12525b
            r12.a(r13)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.O(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded, java.lang.String, boolean):void");
    }

    public final kotlin.Q<Boolean, String> P(long j12, Long l12) throws Resources.NotFoundException {
        String string;
        H0 h02 = this.f259540a;
        boolean z12 = true;
        if (l12 == null) {
            string = h02.f259298a.getString(R.string.sbc_auto_dispatch_please_enter_budget_message);
        } else if (l12.longValue() < j12) {
            string = h02.f259298a.getString(R.string.sbc_auto_dispatch_entered_budget_smaller_than_minimal_message, h02.f259299b.a(j12));
        } else {
            z12 = false;
            string = "";
        }
        return new kotlin.Q<>(Boolean.valueOf(z12), string);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.I(this.f259547h.c(), C43175k.C(new X(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(new C43137a0(new V(this, null), C43175k.N(c43197r1, new U(C43175k.t(this.f259555p.f92113b, 1), this))), W.f259518l)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<Uo0.f> b(Uo0.e eVar, CreateDiscountDispatchState createDiscountDispatchState) {
        return J(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded p(To0.C15384a r67, com.avito.android.mnz_common.data.MnzFloatingFooter r68) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.p(To0.a, com.avito.android.mnz_common.data.MnzFloatingFooter):com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded");
    }

    public final CreateDiscountDispatchState.DiscountDispatchDataLoaded.d q(long j12, CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar, CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVar) throws Resources.NotFoundException {
        boolean z12;
        if ((iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.c) || !hVar.f259687c) {
            return null;
        }
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState autoDispatchToggleState = j12 == 0 ? CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259649d : hVar.f259688d ? CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259647b : CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259648c;
        long f259736d = iVar.getF259736d();
        Iterable iterableU = C42745f0.U(u(3L, j12, f259736d, false), u(7L, j12, f259736d, true), u(14L, j12, f259736d, false));
        if (hVar.f259697m && (iterableU = hVar.f259696l) == null) {
            iterableU = C42784z0.f406748b;
        }
        Iterable iterable = iterableU;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z12 = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((To0.d) it.next()).f15903c) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
        int i12 = 0;
        for (Object obj : iterable) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            To0.d dVar = (To0.d) obj;
            arrayList.add(new InterfaceC15546c.b(z12 ? dVar.f15903c : i12 == 0, i12, dVar.f15902b, dVar.f15904d, dVar.f15901a, dVar.f15905e));
            i12 = i13;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(new InterfaceC15546c.a(arrayList2.size() == 0));
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.c cVar = new CreateDiscountDispatchState.DiscountDispatchDataLoaded.c(arrayList2);
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.b bVarS = s(null, cVar);
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.a aVarR = r(cVar, bVarS, null, iVar.getF259736d(), j12, hVar);
        C15385b c15385b = hVar.f259686b;
        H0 h02 = this.f259540a;
        AttributedText attributedText = c15385b.f15890i;
        CharSequence charSequenceC = attributedText != null ? h02.f259300c.c(h02.f259301d, attributedText) : null;
        AttributedText attributedText2 = c15385b.f15892k;
        return new CreateDiscountDispatchState.DiscountDispatchDataLoaded.d(autoDispatchToggleState, cVar, bVarS, aVarR, attributedText2 != null ? h02.f259300c.c(h02.f259301d, attributedText2) : null, c15385b.f15891j, c15385b.f15889h, charSequenceC);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.a r(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.c r31, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.b r32, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.a r33, long r34, long r36, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.h r38) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.r(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$c, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$b, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$a, long, long, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$h):com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.c v(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.h r37, long r38, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i r40, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.d r41, To0.e r42, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.c r43) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.v(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$h, long, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$i, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$d, To0.e, com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$c):com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$c");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.j w(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i r18, java.time.LocalDate r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34469a.w(com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$i, java.time.LocalDate):com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$j");
    }

    public final CreateDiscountDispatchState.d x() {
        this.f259548i.b(AbstractC14721b.C0807b.f12530b);
        H0 h02 = this.f259540a;
        return new CreateDiscountDispatchState.d(h02.f259298a.getString(R.string.messenger_create_discount_try_again), new com.avito.android.sbc.create.mvi.util.d(h02.f259298a.getString(R.string.messenger_create_discount_try_later), null), h02.f259298a.getString(R.string.messenger_discount_dispatch_update), e.k.f16630a, false, "repeat_error");
    }

    public final Long z(CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar) {
        Long lY2 = y(dVar);
        if (lY2 == null) {
            return null;
        }
        long jLongValue = lY2.longValue();
        ZoneId zoneId = this.f259544e.f260186b;
        return Long.valueOf(ZonedDateTime.of(LocalDate.now(zoneId).plusDays(jLongValue).atStartOfDay().toLocalDate(), LocalTime.MIN, zoneId).toInstant().toEpochMilli());
    }
}
