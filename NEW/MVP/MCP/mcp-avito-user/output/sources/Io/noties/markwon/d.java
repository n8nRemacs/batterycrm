package io.noties.markwon;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import j.N;

/* compiled from: LinkResolverDef.java */
/* loaded from: classes8.dex */
public class d implements InterfaceC41742c {
    @N
    private static Uri parseLink(@N String str) {
        Uri uri = Uri.parse(str);
        return TextUtils.isEmpty(uri.getScheme()) ? uri.buildUpon().scheme(Constants.SCHEME).build() : uri;
    }

    @Override // io.noties.markwon.InterfaceC41742c
    public void resolve(@N View view, @N String str) {
        Uri link = parseLink(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", link);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
