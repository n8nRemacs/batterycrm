package com.avito.android.publish.details;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.avito.android.util.C35835l0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.publish.details.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class RunnableC33751g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f234620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33757i f234621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ContextThemeWrapper f234622d;

    public /* synthetic */ RunnableC33751g(C33757i c33757i, ContextThemeWrapper contextThemeWrapper, int i12) {
        this.f234620b = i12;
        this.f234621c = c33757i;
        this.f234622d = contextThemeWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.f234620b) {
            case 0:
                this.f234621c.f234698c.c(C35835l0.j(com.avito.android.lib.util.f.d("secondaryLarge"), this.f234622d), true);
                break;
            default:
                this.f234621c.f234698c.c(C35835l0.j(com.avito.android.lib.util.f.d("primaryLarge"), this.f234622d), true);
                break;
        }
    }
}
