package com.avito.android.ui.status_bar;

import android.R;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* compiled from: EdgeToEdgeFakeStatusBarOwner.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/ui/status_bar/a;", "", "Landroid/view/View;", "", "shouldHandleKeyboard", "Lkotlin/G0;", "handleEdgeToEdgeWithFakeStatusBarIfNeeded", "(Landroid/view/View;Z)V", "a", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* renamed from: Z1, reason: collision with root package name */
    @Y61.k
    public static final C9355a f304645Z1 = C9355a.f304646a;

    /* compiled from: EdgeToEdgeFakeStatusBarOwner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/status_bar/a$a;", "", "<init>", "()V", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ui.status_bar.a$a, reason: collision with other inner class name */
    public static final class C9355a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C9355a f304646a = new C9355a();
    }

    /* compiled from: EdgeToEdgeFakeStatusBarOwner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        public static void a(@Y61.k Activity activity, boolean z12) {
            b(activity.findViewById(R.id.content), z12);
        }

        public static void b(View view, boolean z12) {
            com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
            iVar.getClass();
            if (com.avito.android.lib.util.i.f181377e) {
                a.f304645Z1.getClass();
                com.avito.android.lib.util.i.h(iVar, view, new com.avito.android.ui.status_bar.b(view.findViewById(com.avito.android.R.id.edge_to_edge_fake_status_bar), view), 31);
                if (z12) {
                    com.avito.android.lib.util.i.f(iVar, view);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void c(@Y61.k Fragment fragment, boolean z12) {
            com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
            iVar.getClass();
            if (com.avito.android.lib.util.i.f181377e) {
                if (z12) {
                    com.avito.android.lib.util.i.f(iVar, fragment.requireView());
                }
                if (c.a(fragment)) {
                    return;
                }
                b(fragment.requireView(), false);
            }
        }
    }

    boolean S3();
}
