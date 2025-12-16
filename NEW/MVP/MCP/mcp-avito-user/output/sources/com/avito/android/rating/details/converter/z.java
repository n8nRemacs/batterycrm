package com.avito.android.rating.details.converter;

import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.rating_details_mvi.TextSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsReviewConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_rating_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z {
    public static final ArrayList a(List list) {
        ArrayList arrayList;
        if (list == null) {
            return null;
        }
        List<TextSection> list2 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (TextSection textSection : list2) {
            String title = textSection.getTitle();
            String text = textSection.getText();
            List<TextSection.HighlightedText> highlightedText = textSection.getHighlightedText();
            if (highlightedText != null) {
                List<TextSection.HighlightedText> list3 = highlightedText;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
                for (TextSection.HighlightedText highlightedText2 : list3) {
                    String text2 = highlightedText2.getText();
                    TextSection.Highlight highlight = highlightedText2.getHighlight();
                    arrayList3.add(new BaseRatingReviewItem.ReviewTextSection.HighlightedText(text2, highlight != null ? new BaseRatingReviewItem.ReviewTextSection.Highlight(highlight.getBackground(), new BaseRatingReviewItem.ReviewTextSection.BorderRadius(highlight.getBorderRadius().getLeft(), highlight.getBorderRadius().getRight())) : null));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            arrayList2.add(new BaseRatingReviewItem.ReviewTextSection(title, text, arrayList, false, 8, null));
        }
        return arrayList2;
    }
}
