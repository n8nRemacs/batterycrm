package com.avito.android.stories;

import android.app.Application;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.stories.StoriesActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StoriesIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/j;", "Lcom/avito/android/stories/i;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements InterfaceC35060i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f285142a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L f285143b;

    @Inject
    public j(@Y61.k Application application, @Y61.k L l12) {
        this.f285142a = application;
        this.f285143b = l12;
    }

    @Override // com.avito.android.stories.InterfaceC35060i
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.l String str2, @Y61.l Intent intent, boolean z12, @Y61.l String str3, @Y61.l String str4) {
        StoriesArguments storiesArguments = new StoriesArguments(str, str2, intent, str3, str4);
        if (!z12) {
            return this.f285143b.d(new StoriesFragmentData(storiesArguments, NavigationTab.f106970f));
        }
        new StoriesActivity.a();
        Intent intentPutExtra = new Intent(this.f285142a, (Class<?>) StoriesActivity.class).putExtra("arguments", storiesArguments);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }
}
