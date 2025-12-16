package com.avito.android.beduin.ui.screen.fragment.tabs;

import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: TabsScreenStatusBarUpdatesProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/q;", "Lcom/avito/android/ui/status_bar/k;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements com.avito.android.ui.status_bar.k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<com.avito.android.ui.status_bar.d> f104362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> f104363c;

    /* compiled from: TabsScreenStatusBarUpdatesProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TabsScreenModel.NavigationBarSettings.StatusBarContentAppearance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TabsScreenModel.NavigationBarSettings.StatusBarContentAppearance statusBarContentAppearance = TabsScreenModel.NavigationBarSettings.StatusBarContentAppearance.f104353b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TabsScreenModel.NavigationBarSettings.StatusBarContentAppearance statusBarContentAppearance2 = TabsScreenModel.NavigationBarSettings.StatusBarContentAppearance.f104353b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TabsScreenModel.NavigationBarSettings.StatusBarContentAppearance statusBarContentAppearance3 = TabsScreenModel.NavigationBarSettings.StatusBarContentAppearance.f104353b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public q() {
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f104362b = z1A;
        this.f104363c = z1A;
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f104363c;
    }
}
