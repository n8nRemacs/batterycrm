package com.avito.android.ui.widget.tagged_input;

import com.avito.android.remote.model.category_parameters.TextualTag;
import com.avito.android.remote.model.publish.BubbleSuggest;
import com.avito.android.ui.widget.tagged_input.TagItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TagItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_publish-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: TagItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f304704a;

        static {
            int[] iArr = new int[BubbleSuggest.SuggestType.values().length];
            try {
                iArr[BubbleSuggest.SuggestType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BubbleSuggest.SuggestType.TYPO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f304704a = iArr;
        }
    }

    @Y61.k
    public static final TagItem a(@Y61.k TextualTag textualTag) {
        String value = textualTag.getValue();
        StringBuilder sb2 = new StringBuilder();
        String prefix = textualTag.getPrefix();
        if (prefix == null) {
            prefix = "";
        }
        sb2.append(prefix);
        sb2.append(textualTag.getValue());
        String postfix = textualTag.getPostfix();
        sb2.append(postfix != null ? postfix : "");
        return new TagItem(value, new TagItem.Value(sb2.toString(), false), null, null, 12, null);
    }
}
