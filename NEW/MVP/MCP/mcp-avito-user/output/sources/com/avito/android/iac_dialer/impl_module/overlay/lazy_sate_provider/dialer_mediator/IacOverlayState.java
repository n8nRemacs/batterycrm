package com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.dialer_mediator;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.utils.HasIndex;
import com.avito.android.iac_dialer_ui.pub.overlay_widget.IacUIOverlayWidgetState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacOverlayState.kt */
@P
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;", "Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex;", "()V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "indexType", "Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$Type;", "getIndexType", "()Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$Type;", "Hidden", "Visible", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState$Hidden;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState$Visible;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacOverlayState implements HasIndex {
    public static final int $stable = 8;
    private int index;

    @k
    private final HasIndex.Type indexType;

    /* compiled from: IacOverlayState.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState$Hidden;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Hidden extends IacOverlayState {
        public static final int $stable = 0;

        @k
        public static final Hidden INSTANCE = new Hidden();

        private Hidden() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Hidden);
        }

        public int hashCode() {
            return -1751812678;
        }

        @k
        public String toString() {
            return "IacOverlayState.Hidden_" + getIndex();
        }
    }

    /* compiled from: IacOverlayState.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState$Visible;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;", "uiState", "Lcom/avito/android/iac_dialer_ui/pub/overlay_widget/IacUIOverlayWidgetState;", "(Lcom/avito/android/iac_dialer_ui/pub/overlay_widget/IacUIOverlayWidgetState;)V", "getUiState", "()Lcom/avito/android/iac_dialer_ui/pub/overlay_widget/IacUIOverlayWidgetState;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Visible extends IacOverlayState {
        public static final int $stable = 0;

        /* renamed from: uiState, reason: from kotlin metadata and from toString */
        @k
        private final IacUIOverlayWidgetState state;

        public Visible(@k IacUIOverlayWidgetState iacUIOverlayWidgetState) {
            super(null);
            this.state = iacUIOverlayWidgetState;
        }

        public static /* synthetic */ Visible copy$default(Visible visible, IacUIOverlayWidgetState iacUIOverlayWidgetState, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacUIOverlayWidgetState = visible.state;
            }
            return visible.copy(iacUIOverlayWidgetState);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacUIOverlayWidgetState getState() {
            return this.state;
        }

        @k
        public final Visible copy(@k IacUIOverlayWidgetState uiState) {
            return new Visible(uiState);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Visible) && L.f(this.state, ((Visible) other).state);
        }

        @k
        public final IacUIOverlayWidgetState getUiState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        @k
        public String toString() {
            return "IacOverlayState.Visible_" + getIndex() + "(state=" + this.state + ')';
        }
    }

    public /* synthetic */ IacOverlayState(C42822w c42822w) {
        this();
    }

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    public int getIndex() {
        return this.index;
    }

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    @k
    public HasIndex.Type getIndexType() {
        return this.indexType;
    }

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    public void setIndex(int i12) {
        this.index = i12;
    }

    private IacOverlayState() {
        this.index = -1;
        this.indexType = HasIndex.Type.f166508d;
    }
}
