package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.text.FontParameter;
import kotlin.Metadata;

/* compiled from: FontParameterTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/z;", "", "<init>", "()V", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.parse.adapter.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C34382z {
    @Y61.k
    public static RuntimeTypeAdapterFactory a() {
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(FontParameter.class);
        runtimeTypeAdapterFactory.b(FontParameter.StyleParameter.class, "fontStyle", null);
        runtimeTypeAdapterFactory.b(FontParameter.ColorParameter.class, "fontColor", null);
        runtimeTypeAdapterFactory.b(FontParameter.StrikethroughParameter.class, "strikeThrough", null);
        runtimeTypeAdapterFactory.b(FontParameter.TextStyleParameter.class, "textStyle", null);
        runtimeTypeAdapterFactory.b(FontParameter.ParagraphSpacingRelativeParameter.class, "paragraphSpacingRelative", null);
        runtimeTypeAdapterFactory.b(FontParameter.UseParagraphingParameter.class, "useParagraphing", null);
        runtimeTypeAdapterFactory.b(FontParameter.UnderlineParameter.class, "underline", null);
        runtimeTypeAdapterFactory.b(FontParameter.TextAlignmentParameter.class, "textAlignment", null);
        runtimeTypeAdapterFactory.b(FontParameter.ParagraphSpacingParameter.class, "paragraphSpacing", null);
        return runtimeTypeAdapterFactory;
    }
}
