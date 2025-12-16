package XK;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModePeerInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUICallHeaderState;
import com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.n;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacFinishedFeedbackScreenUIStateMapper.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXK/b;", "LXK/a;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f18827a;

    @Inject
    public b(@k Context context) {
        this.f18827a = context;
    }

    @Override // XK.a
    @k
    public final n a(@k IacFinishedFeedbackScreenState iacFinishedFeedbackScreenState) {
        boolean zIsVideo = iacFinishedFeedbackScreenState.getArgument().isVideo();
        Context context = this.f18827a;
        return new n(new IacUICallHeaderState(zIsVideo ? context.getString(R.string.iac_dialer_ui_public___cahh_header___video) : context.getString(R.string.iac_dialer_ui_public___cahh_header___audio)), new IacUIAudioModePeerInfoState(iacFinishedFeedbackScreenState.getArgument().getPeerName(), iacFinishedFeedbackScreenState.getArgument().getPeerAvatar(), iacFinishedFeedbackScreenState.getArgument().getStatus(), false, null, null), iacFinishedFeedbackScreenState.getSelectedRating(), iacFinishedFeedbackScreenState.isRatingClickable(), iacFinishedFeedbackScreenState.getArgument().getAvailableProblems(), iacFinishedFeedbackScreenState.getSelectedProblemIndex());
    }
}
