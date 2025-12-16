package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.L;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextPreparedSelection.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/selection/B1;", "Landroidx/compose/foundation/text/selection/i;", "Landroidx/compose/ui/text/e;", "originalText", "Landroidx/compose/ui/text/v0;", "originalSelection", "Landroidx/compose/ui/text/o0;", "layoutResult", "Landroidx/compose/ui/text/input/L;", "offsetMapping", "Landroidx/compose/foundation/text/selection/C1;", VoiceInfo.STATE, "<init>", "(Landroidx/compose/ui/text/e;JLandroidx/compose/ui/text/o0;Landroidx/compose/ui/text/input/L;Landroidx/compose/foundation/text/selection/C1;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B1 extends AbstractC21016i<B1> {
    /* JADX WARN: Illegal instructions before constructor call */
    public B1(C22602e c22602e, long j12, androidx.compose.ui.text.o0 o0Var, androidx.compose.ui.text.input.L l12, C1 c12, int i12, C42822w c42822w) {
        androidx.compose.ui.text.input.L l13;
        androidx.compose.ui.text.o0 o0Var2 = (i12 & 4) != 0 ? null : o0Var;
        if ((i12 & 8) != 0) {
            androidx.compose.ui.text.input.L.f42358a.getClass();
            l13 = L.a.f42360b;
        } else {
            l13 = l12;
        }
        this(c22602e, j12, o0Var2, l13, (i12 & 16) != 0 ? new C1() : c12, null);
    }

    public B1(C22602e c22602e, long j12, androidx.compose.ui.text.o0 o0Var, androidx.compose.ui.text.input.L l12, C1 c12, C42822w c42822w) {
        super(c22602e, j12, o0Var, l12, c12, null);
    }
}
