package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRInstructionsViewHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0001\fJ@\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "", "onVerificationStep", "Landroid/view/View;", "context", "Landroid/content/Context;", "verificationStep", "", "idDocumentType", "scene", "position", "countryCode", "Position", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface CBRInstructionsViewHandler {

    /* compiled from: CBRInstructionsViewHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler$Position;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FULLSCREEN", "BOTTOMSHEET", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Position {
        FULLSCREEN("fullScreen"),
        BOTTOMSHEET("bottomSheet");


        @k
        private final String value;

        Position(String str) {
            this.value = str;
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }

    @l
    View onVerificationStep(@k Context context, @k String verificationStep, @l String idDocumentType, @k String scene, @l String position, @l String countryCode);
}
