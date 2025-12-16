package com.avito.android.deep_linking;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35845m2;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: UriOpener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/V;", "", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final V f132879a = new V();

    public static void a(@Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k Resources resources, @Y61.k Uri uri, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        ArrayList arrayListN = interfaceC35845m2.n(uri);
        int size = arrayListN.size();
        if (size == 0) {
            lVar.invoke(resources.getString(R.string.no_application_installed_to_perform_this_action));
        } else {
            if (size == 1) {
                lVar2.invoke(C42745f0.E(arrayListN));
                return;
            }
            String string = resources.getString(R.string.open_with);
            ArrayList arrayList = new ArrayList(arrayListN);
            lVar2.invoke(interfaceC35845m2.x(string, (Intent) arrayList.remove(0), arrayList));
        }
    }
}
