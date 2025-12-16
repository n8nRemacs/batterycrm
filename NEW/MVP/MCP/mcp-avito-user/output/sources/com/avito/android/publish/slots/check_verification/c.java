package com.avito.android.publish.slots.check_verification;

import Cd0.I0;
import JO.p;
import JO.q;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.analytics.C33525k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.check_verification_slot.CheckVerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.check_verification_slot.CheckVerificationSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.check_verification_slot.ContentDependsOnStatus;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: CheckVerificationSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/check_verification/c;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/CheckVerificationSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.android.category_parameters.k<CheckVerificationSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CheckVerificationSlot f243169b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f243170c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C33525k f243171d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public BlockType f243172e;

    /* compiled from: CheckVerificationSlotWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f243173a;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                BlockType blockType = BlockType.f243164b;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BlockType blockType2 = BlockType.f243164b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BlockType blockType3 = BlockType.f243164b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f243173a = iArr;
        }
    }

    /* compiled from: CheckVerificationSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/check_verification/BlockType;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/check_verification/BlockType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.this.f243172e = (BlockType) obj;
        }
    }

    /* compiled from: CheckVerificationSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/slots/check_verification/BlockType;", "it", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/publish/slots/check_verification/BlockType;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.check_verification.c$c, reason: collision with other inner class name */
    public static final class C7290c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C7290c<T, R> f243175b = new C7290c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b(G0.f406611a);
        }
    }

    @i31.c
    public c(@InterfaceC41220a @Y61.k CheckVerificationSlot checkVerificationSlot, @Y61.k h hVar, @Y61.k C33525k c33525k) {
        this.f243169b = checkVerificationSlot;
        this.f243170c = hVar;
        this.f243171d = c33525k;
    }

    public static p l(String str, ContentDependsOnStatus contentDependsOnStatus) {
        return new p(str, contentDependsOnStatus.getImage(), contentDependsOnStatus.getTitle(), contentDependsOnStatus.getDescription(), contentDependsOnStatus.getLink(), new JO.b(contentDependsOnStatus.getAction().getTitle(), contentDependsOnStatus.getAction().getDeeplink()));
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243169b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        return this.f243170c.a().k(new b()).r(C7290c.f243175b).u(new C32102w0(14)).F();
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        Object objL;
        BlockType blockType = this.f243172e;
        int i12 = blockType == null ? -1 : a.f243173a[blockType.ordinal()];
        if (i12 != -1) {
            C33525k c33525k = this.f243171d;
            CheckVerificationSlot checkVerificationSlot = this.f243169b;
            if (i12 == 1) {
                c33525k.f232258a.c(new I0("popup_lf_verification_pending", c33525k.f232259b.a()));
                objL = l("popup_lf_verification_pending", ((CheckVerificationSlotConfig) checkVerificationSlot.getWidget().getConfig()).getVerificationStatusPending());
            } else if (i12 == 2) {
                c33525k.f232258a.c(new I0("popup_lf_verification_required", c33525k.f232259b.a()));
                objL = l("popup_lf_verification_required", ((CheckVerificationSlotConfig) checkVerificationSlot.getWidget().getConfig()).getVerificationStatusRequired());
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                objL = new q(checkVerificationSlot.getId());
            }
        } else {
            objL = null;
        }
        return objL != null ? Collections.singletonList(objL) : C42784z0.f406748b;
    }
}
