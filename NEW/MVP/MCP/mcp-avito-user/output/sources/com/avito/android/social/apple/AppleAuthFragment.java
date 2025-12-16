package com.avito.android.social.apple;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.social.apple.b;
import com.avito.android.social.apple.j;
import com.avito.android.social.di.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AppleAuthFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/social/apple/AppleAuthFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/social/apple/b$a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppleAuthFragment extends DialogFragment implements b.a, InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final a f284304h0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public f f284305f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public n f284306g0;

    /* compiled from: AppleAuthFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/apple/AppleAuthFragment$a;", "", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final void b5(@Y61.l j jVar) {
        if (jVar instanceof j.b) {
            Intent intent = new Intent();
            j.b bVar = (j.b) jVar;
            intent.putExtra("token", bVar.f284310a);
            intent.putExtra(ChannelContext.UserToUser.TYPE, bVar.f284311b);
            ActivityC22955m activityC22955mL1 = l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.setResult(-1, intent);
            }
        } else if (jVar instanceof j.a) {
            ActivityC22955m activityC22955mL12 = l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.setResult(1);
            }
        } else {
            ActivityC22955m activityC22955mL13 = l1();
            if (activityC22955mL13 != null) {
                activityC22955mL13.setResult(0);
            }
        }
        ActivityC22955m activityC22955mL14 = l1();
        if (activityC22955mL14 != null) {
            activityC22955mL14.finish();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@Y61.k DialogInterface dialogInterface) {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.setResult(0);
        }
        ActivityC22955m activityC22955mL12 = l1();
        if (activityC22955mL12 != null) {
            activityC22955mL12.finish();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        a.InterfaceC8498a interfaceC8498aA = com.avito.android.social.di.d.a();
        interfaceC8498aA.a((com.avito.android.social.di.b) C29972i.a(C29972i.b(this), com.avito.android.social.di.b.class));
        interfaceC8498aA.build().a(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_apple_auth, viewGroup, false);
        n nVar = this.f284306g0;
        if (nVar == null) {
            nVar = null;
        }
        l lVar = new l(viewInflate, nVar);
        f fVar = this.f284305f0;
        f fVar2 = fVar != null ? fVar : null;
        fVar2.f284308b = lVar;
        lVar.f284318h = new c(0, fVar2, f.class, "onCloseScreen", "onCloseScreen()V", 0);
        lVar.f284317g = new d(0, fVar2, f.class, "loadAuthPage", "loadAuthPage()V", 0);
        nVar.c(new e(1, fVar2, f.class, "onAuthResult", "onAuthResult(Lcom/avito/android/social/apple/AppleAuthResult;)V", 0));
        fVar2.a();
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f fVar = this.f284305f0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f284308b = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        f fVar = this.f284305f0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f284309c = this;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        f fVar = this.f284305f0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f284309c = null;
        super.onStop();
    }
}
