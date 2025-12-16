package com.avito.android.util;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.deep_linking.links.Store;
import com.avito.android.remote.model.Coordinates;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ImplicitIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/m2;", "", "_avito_intent-factories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.m2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC35845m2 {

    /* compiled from: ImplicitIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.m2$a */
    public static final class a {
    }

    @Y61.k
    Intent a();

    @Y61.k
    Intent b(@Y61.k Store store);

    @Y61.k
    Intent c(@Y61.l String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    Intent d(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    Intent e();

    @Y61.k
    Intent f(@Y61.l String str, @Y61.k String str2);

    @Y61.k
    Intent g(@Y61.k String str);

    @Y61.k
    Intent h();

    @Y61.k
    Intent i();

    @Y61.k
    Intent j(@Y61.k Uri uri);

    @Y61.k
    Intent k(@Y61.k Coordinates coordinates);

    @Y61.k
    Intent l();

    @Y61.k
    Intent m(@Y61.k Uri uri, @Y61.l String str);

    @Y61.k
    ArrayList n(@Y61.k Uri uri);

    @Y61.k
    Intent o();

    @Y61.k
    Intent p(@Y61.k Uri uri, @Y61.l String str, @Y61.k String str2);

    @Y61.l
    Intent q(@Y61.k Uri uri, @Y61.l Uri uri2);

    @Y61.k
    Intent r();

    @Y61.k
    Intent s(@Y61.k String[] strArr);

    @Y61.k
    Intent t(@Y61.k Uri uri);

    @Y61.k
    Intent u(@Y61.k Uri uri, boolean z12, boolean z13);

    @Y61.k
    PendingIntent v(@Y61.k Class<?> cls);

    @Y61.k
    Intent w(@Y61.k String[] strArr);

    @Y61.k
    Intent x(@Y61.k String str, @Y61.k Intent intent, @Y61.k ArrayList arrayList);

    @Y61.k
    Intent y(@Y61.k String str, @Y61.k String str2);
}
