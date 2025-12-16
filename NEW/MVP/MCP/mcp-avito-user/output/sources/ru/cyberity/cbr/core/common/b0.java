package ru.cyberity.cbr.core.common;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: FragmentExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/Fragment;", "", ContextActionHandler.Link.URL, "Lkotlin/G0;", "a", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b0 {
    public static final void a(@Y61.k Fragment fragment, @Y61.k String str) {
        try {
            fragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((C43066x.h0(str, "http://", false) || C43066x.h0(str, "https://", false)) ? str : "https://".concat(str))));
        } catch (Exception e12) {
            ru.cyberity.log.a.f436064a.e(s.a(fragment), "Can't open url ".concat(str), e12);
        }
    }
}
