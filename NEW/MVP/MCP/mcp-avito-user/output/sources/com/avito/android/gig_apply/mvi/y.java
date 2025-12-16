package com.avito.android.gig_apply.mvi;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.RouteDetail;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotInfoV2;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotPayment;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotWarningV3;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.Timer;
import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import mH.C43964c;

/* compiled from: GigSlotReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/mvi/y;", "Lcom/avito/android/arch/mvi/u;", "LpH/k;", "LpH/w;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class y implements com.avito.android.arch.mvi.u<pH.k, pH.w> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigSlotOpenParams f159795b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_snippet.a f159796c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f159797d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Resources f159798e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43964c f159799f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f159800g;

    /* compiled from: GigSlotReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159801a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f159802b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f159803c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f159804d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f159805e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f159806f;

        static {
            int[] iArr = new int[SlotPayment.Icon.values().length];
            try {
                iArr[SlotPayment.Icon.Sbp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlotPayment.Icon.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f159801a = iArr;
            int[] iArr2 = new int[SlotPayment.Status.values().length];
            try {
                iArr2[SlotPayment.Status.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SlotPayment.Status.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f159802b = iArr2;
            int[] iArr3 = new int[Timer.Direction.values().length];
            try {
                iArr3[Timer.Direction.AfterStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Timer.Direction.UntilFinished.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Timer.Direction.UntilStart.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f159803c = iArr3;
            int[] iArr4 = new int[SlotInfoV2.Title.values().length];
            try {
                iArr4[SlotInfoV2.Title.Payment.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[SlotInfoV2.Title.InfoPayment.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f159804d = iArr4;
            int[] iArr5 = new int[SlotWarningV3.Preset.values().length];
            try {
                iArr5[SlotWarningV3.Preset.WarmGray.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[SlotWarningV3.Preset.Yellow.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[SlotWarningV3.Preset.Red.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f159805e = iArr5;
            int[] iArr6 = new int[RouteDetail.Type.values().length];
            try {
                iArr6[RouteDetail.Type.ExternalFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr6[RouteDetail.Type.WebView.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f159806f = iArr6;
        }
    }

    @Inject
    public y(@Y61.k GigSlotOpenParams gigSlotOpenParams, @Y61.k com.avito.android.gig_snippet.a aVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k Resources resources, @Y61.k C43964c c43964c, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f159795b = gigSlotOpenParams;
        this.f159796c = aVar;
        this.f159797d = xVar;
        this.f159798e = resources;
        this.f159799f = c43964c;
        this.f159800g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0646 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x075f  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pH.w a(pH.k r83, pH.w r84) {
        /*
            Method dump skipped, instructions count: 1988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_apply.mvi.y.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final pH.j b(LG.q qVar) {
        if (qVar == null) {
            return null;
        }
        String label = qVar.getLabel();
        String uri = qVar.getUri();
        return new pH.j(label, uri != null ? this.f159797d.b(uri) : null);
    }
}
