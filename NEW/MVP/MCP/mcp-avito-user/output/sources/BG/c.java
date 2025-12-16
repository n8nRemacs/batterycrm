package bG;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetGigWorkerMotivationsResponse.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LbG/c;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LbG/a;", "emptyMotivationInfo", "LbG/h;", "image", "", "LbG/d;", "snippets", "", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LbG/a;LbG/h;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LbG/a;", "b", "()LbG/a;", "LbG/h;", "c", "()LbG/h;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("emptyMotivationInfo")
    @l
    private final C25508a emptyMotivationInfo;

    @com.google.gson.annotations.c("image")
    @l
    private final h image;

    @com.google.gson.annotations.c("snippets")
    @l
    private final List<d> snippets;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public c(@l AttributedText attributedText, @l C25508a c25508a, @l h hVar, @l List<d> list, @l String str) {
        this.description = attributedText;
        this.emptyMotivationInfo = c25508a;
        this.image = hVar;
        this.snippets = list;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C25508a getEmptyMotivationInfo() {
        return this.emptyMotivationInfo;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final h getImage() {
        return this.image;
    }

    @l
    public final List<d> d() {
        return this.snippets;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
