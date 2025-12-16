package com.avito.android.stories;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.stories.StoriesFragment;
import java.util.Iterator;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StoriesActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/stories/StoriesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoriesActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: StoriesActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/StoriesActivity$a;", "", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.stories_screen;
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onBackPressed() {
        Object next;
        Iterator<T> it = getSupportFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Fragment fragment = (Fragment) next;
            if (fragment.isVisible() && (fragment instanceof StoriesFragment)) {
                break;
            }
        }
        StoriesFragment storiesFragment = (StoriesFragment) (next instanceof StoriesFragment ? next : null);
        if (storiesFragment != null) {
            storiesFragment.i0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            overrideActivityTransition(0, R.anim.fade_in_stories, 0);
        } else {
            overridePendingTransition(R.anim.fade_in_stories, 0);
        }
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        Intent intent = getIntent();
        StoriesArguments storiesArguments = (StoriesArguments) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra("arguments", StoriesArguments.class) : intent.getParcelableExtra("arguments"));
        if (storiesArguments == null) {
            throw new RuntimeException("arguments was not passed to " + this);
        }
        if (bundle == null) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            StoriesFragment.f284993A0.getClass();
            hE2.j(R.id.fragment_container, StoriesFragment.a.a(storiesArguments), null, 1);
            hE2.e();
        }
    }
}
