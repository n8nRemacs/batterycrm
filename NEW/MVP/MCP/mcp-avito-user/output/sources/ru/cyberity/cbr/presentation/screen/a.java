package ru.cyberity.cbr.presentation.screen;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import ru.cyberity.cbr.core.common.g;
import ru.cyberity.cbr.core.domain.model.c;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel.CBRViewModelState;

/* compiled from: CBRInstructionsAwareFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/presentation/screen/a;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "VM", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "", "success", "Landroid/os/Parcelable;", "payload", "a", "(ZLandroid/os/Parcelable;)V", "Lru/cyberity/cbr/core/domain/model/c;", "introParams", "(Lru/cyberity/cbr/core/domain/model/c;Landroid/os/Parcelable;)Lkotlin/G0;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class a<S extends CBRViewModel.CBRViewModelState, VM extends CBRViewModel<S>> extends BaseFragment<S, VM> {
    public void a(boolean success, @l Parcelable payload) {
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void onViewModelPrepared(@l Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        requireActivity().getSupportFragmentManager().p0("instructions_request_key", this, new com.my.target.ads.a(this, 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, String str, Bundle bundle) {
        aVar.a(BaseFragment.INSTANCE.isSuccessResult(bundle), bundle.getParcelable("payload"));
    }

    @l
    public final G0 a(@k c introParams, @l Parcelable payload) {
        g appListener = getAppListener();
        if (appListener == null) {
            return null;
        }
        appListener.a(introParams, payload);
        return G0.f406611a;
    }
}
