package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.deeplinks.PhoneManagementLink;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wb0.InterfaceC49590a;

/* compiled from: PhonesListMviActor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lwb0/a;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviState;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33433e implements com.avito.android.arch.mvi.a<InterfaceC49590a, PhonesListMviInternalAction, PhonesListMviState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f227963a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f227964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f227965c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NL.e f227966d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NL.f f227967e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.phones_list.L f227968f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final OL.a f227969g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.statsd.F f227970h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f227971i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ML.a f227972j;

    /* compiled from: PhonesListMviActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phones_list.mvi.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f227973a;

        static {
            int[] iArr = new int[PhoneManagementLink.ActionType.values().length];
            try {
                iArr[PhoneManagementLink.ActionType.REPLACE_AND_DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneManagementLink.ActionType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneManagementLink.ActionType.SET_TO_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhoneManagementLink.ActionType.REPLACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f227973a = iArr;
        }
    }

    @Inject
    public C33433e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k G g12, @Y61.k com.avito.android.permissions.z zVar, @Y61.k NL.e eVar, @Y61.k NL.f fVar, @Y61.k com.avito.android.profile_phones.phones_list.L l12, @Y61.k OL.a aVar2, @Y61.k com.avito.android.analytics.statsd.F f12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k ML.a aVar3) {
        this.f227963a = aVar;
        this.f227964b = g12;
        this.f227965c = zVar;
        this.f227966d = eVar;
        this.f227967e = fVar;
        this.f227968f = l12;
        this.f227969g = aVar2;
        this.f227970h = f12;
        this.f227971i = interfaceC28373a;
        this.f227972j = aVar3;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, C33440l.f228056l, new C33441m(this, aVar), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Type inference failed for: r15v13, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction> b(@Y61.k wb0.InterfaceC49590a r14, @Y61.k com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState r15) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.C33433e.b(wb0.a, com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState):kotlinx.coroutines.flow.i");
    }
}
