package com.avito.android.serp.adapter.snippet;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.serp.Snippet;
import com.avito.android.serp.adapter.N0;
import kotlin.Metadata;

/* compiled from: SnippetConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/snippet/c;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SnippetConverter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/snippet/c$a;", "Lcom/avito/android/serp/adapter/snippet/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {
        @Override // com.avito.android.serp.adapter.snippet.c
        @k
        public final SnippetItem a(@k Snippet snippet) {
            long jA2 = N0.a(snippet.getUniqueId(), snippet.getId());
            String id2 = snippet.getId();
            Action action = snippet.getAction();
            Image image = snippet.getImage();
            String text = snippet.getText();
            Boolean isClosable = snippet.getIsClosable();
            return new SnippetItem(jA2, id2, 6, action, image, text, isClosable != null ? isClosable.booleanValue() : false, snippet.getAnalytics());
        }
    }

    @k
    SnippetItem a(@k Snippet snippet);
}
