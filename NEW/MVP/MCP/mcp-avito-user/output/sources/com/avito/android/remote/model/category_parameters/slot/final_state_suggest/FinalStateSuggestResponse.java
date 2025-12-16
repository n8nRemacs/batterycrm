package com.avito.android.remote.model.category_parameters.slot.final_state_suggest;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.publish.ParamsSuggest;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FinalStateSuggestResponse.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/final_state_suggest/FinalStateSuggestResponse;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "image", "Lcom/avito/android/remote/model/UniversalImage;", "params", "", "Lcom/avito/android/remote/model/publish/ParamsSuggest;", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;)V", "getContent", "()Lcom/avito/android/remote/model/text/AttributedText;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "getParams", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FinalStateSuggestResponse {

    @c("content")
    @k
    private final AttributedText content;

    @c("image")
    @k
    private final UniversalImage image;

    @c("params")
    @k
    private final List<ParamsSuggest> params;

    @c("title")
    @k
    private final AttributedText title;

    public FinalStateSuggestResponse(@k AttributedText attributedText, @k AttributedText attributedText2, @k UniversalImage universalImage, @k List<ParamsSuggest> list) {
        this.title = attributedText;
        this.content = attributedText2;
        this.image = universalImage;
        this.params = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinalStateSuggestResponse copy$default(FinalStateSuggestResponse finalStateSuggestResponse, AttributedText attributedText, AttributedText attributedText2, UniversalImage universalImage, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = finalStateSuggestResponse.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = finalStateSuggestResponse.content;
        }
        if ((i12 & 4) != 0) {
            universalImage = finalStateSuggestResponse.image;
        }
        if ((i12 & 8) != 0) {
            list = finalStateSuggestResponse.params;
        }
        return finalStateSuggestResponse.copy(attributedText, attributedText2, universalImage, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getContent() {
        return this.content;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final List<ParamsSuggest> component4() {
        return this.params;
    }

    @k
    public final FinalStateSuggestResponse copy(@k AttributedText title, @k AttributedText content, @k UniversalImage image, @k List<ParamsSuggest> params) {
        return new FinalStateSuggestResponse(title, content, image, params);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalStateSuggestResponse)) {
            return false;
        }
        FinalStateSuggestResponse finalStateSuggestResponse = (FinalStateSuggestResponse) other;
        return L.f(this.title, finalStateSuggestResponse.title) && L.f(this.content, finalStateSuggestResponse.content) && L.f(this.image, finalStateSuggestResponse.image) && L.f(this.params, finalStateSuggestResponse.params);
    }

    @k
    public final AttributedText getContent() {
        return this.content;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final List<ParamsSuggest> getParams() {
        return this.params;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.params.hashCode() + a.a(a.b(this.title.hashCode() * 31, 31, this.content), 31, this.image);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FinalStateSuggestResponse(title=");
        sb2.append(this.title);
        sb2.append(", content=");
        sb2.append(this.content);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", params=");
        return H.p(sb2, this.params, ')');
    }
}
