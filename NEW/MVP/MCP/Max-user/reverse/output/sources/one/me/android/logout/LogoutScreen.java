package one.me.android.logout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.e9b;
import defpackage.h9b;
import defpackage.m9b;
import defpackage.zob;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/logout/LogoutScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class LogoutScreen extends Widget {
    /* JADX WARN: Multi-variable type inference failed */
    public LogoutScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // defpackage.c54
    public final boolean handleBack() {
        return true;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundColor(zob.b(-7829368, 0.5f));
        m9b m9bVar = new m9b(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        m9bVar.setLayoutParams(layoutParams);
        m9bVar.setAppearance(e9b.a);
        m9bVar.setSize(h9b.a);
        frameLayout.addView(m9bVar);
        return frameLayout;
    }
}
