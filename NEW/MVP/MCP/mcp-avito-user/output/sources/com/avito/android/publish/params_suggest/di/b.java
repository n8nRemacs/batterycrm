package com.avito.android.publish.params_suggest.di;

import Y61.k;
import com.avito.android.di.B;
import com.avito.android.publish.di.W;
import com.avito.android.publish.params_suggest.ParamsSuggestionsFragment;
import com.avito.android.publish.step.request.suggest.SuggestRequestFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: ParamsSuggestionsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/params_suggest/di/b;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: ParamsSuggestionsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/params_suggest/di/b$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k d dVar, @W @h31.b int i12);
    }

    void a(@k SuggestRequestFragment suggestRequestFragment);

    void b(@k ParamsSuggestionsFragment paramsSuggestionsFragment);
}
