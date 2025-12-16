package RN;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.deep_linking.links.CancellationDialog;
import com.avito.android.deep_linking.links.Loader;
import com.avito.android.deep_linking.links.UxFeedbackActions;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: InstallmentsIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRN/a;", "", "_avito_installments_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: InstallmentsIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RN.a$a, reason: collision with other inner class name */
    public static final class C0961a {
    }

    @k
    Intent a(@l Uri uri, @l String str, @l String str2, @l Map<String, ? extends Object> map, @l Map<String, ? extends Map<String, Integer>> map2, @l Boolean bool, @l Loader loader, @l UxFeedbackActions uxFeedbackActions, @l CancellationDialog cancellationDialog, @l Map<String, Loader> map3);
}
