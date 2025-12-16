package com.avito.android.serp.adapter.rich_snippets;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.serp.SerpAdvertSpecification;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertSpecificationFormatter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/f;", "Lcom/avito/android/serp/adapter/rich_snippets/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f270775a;

    @Inject
    public f(@Y61.k m mVar) {
        this.f270775a = mVar;
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.e
    @Y61.l
    public final CharSequence a(@Y61.l SerpAdvertSpecification serpAdvertSpecification) {
        String highlight = serpAdvertSpecification != null ? serpAdvertSpecification.getHighlight() : null;
        String text = serpAdvertSpecification != null ? serpAdvertSpecification.getText() : null;
        if (serpAdvertSpecification == null || ((highlight == null || highlight.length() == 0) && (text == null || text.length() == 0))) {
            return null;
        }
        if (highlight == null || highlight.length() == 0) {
            return text;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(highlight);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f270775a.a()), 0, spannableStringBuilder.length(), 33);
        if (text != null && text.length() != 0) {
            spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) text);
        }
        return spannableStringBuilder;
    }
}
