package vN0;

import Y61.k;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.p0;
import androidx.view.T0;
import androidx.view.n;
import kotlin.Metadata;

/* compiled from: ViewModelUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_view-model-utils_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: vN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49240a {
    @k
    public static final T0 a(@k View view) {
        try {
            return p0.a(view);
        } catch (IllegalStateException unused) {
            Context context = view.getContext();
            if (context instanceof n) {
                return (n) context;
            }
            while (context instanceof ContextWrapper) {
                if (context instanceof n) {
                    return (n) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            throw new IllegalStateException("No activity found");
        }
    }
}
