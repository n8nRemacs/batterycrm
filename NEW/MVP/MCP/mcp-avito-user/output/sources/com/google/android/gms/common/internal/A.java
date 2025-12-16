package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f349300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f349301b;

    public A(@j.N Context context) {
        C36729v.j(context);
        Resources resources = context.getResources();
        this.f349300a = resources;
        this.f349301b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @RX0.a
    @j.P
    public final String a(@j.N String str) {
        String str2 = this.f349301b;
        Resources resources = this.f349300a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
