package Pb;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ListResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LPb/c;", "", "a", "b", "LPb/c$a;", "LPb/c$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: ListResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LPb/c$a;", "LPb/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "LPb/a;", "image", "", "title", "toastText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LPb/a;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LPb/a;", "b", "()LPb/a;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        @com.google.gson.annotations.c("attributedText")
        @k
        private final AttributedText attributedText;

        @com.google.gson.annotations.c("image")
        @k
        private final C14764a image;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c("toastText")
        @l
        private final String toastText;

        public a(@k AttributedText attributedText, @k C14764a c14764a, @k String str, @l String str2) {
            this.attributedText = attributedText;
            this.image = c14764a;
            this.title = str;
            this.toastText = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final C14764a getImage() {
            return this.image;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getToastText() {
            return this.toastText;
        }
    }

    /* compiled from: ListResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPb/c$b;", "LPb/c;", "", "Lcom/avito/android/ai_assistant/generated/api/list/a;", "elements", "", "nextOffest", "<init>", "(Ljava/util/List;Ljava/lang/Long;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        @com.google.gson.annotations.c("elements")
        @k
        private final List<com.avito.android.ai_assistant.generated.api.list.a> elements;

        @com.google.gson.annotations.c("nextOffest")
        @l
        private final Long nextOffest;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k List<? extends com.avito.android.ai_assistant.generated.api.list.a> list, @l Long l12) {
            this.elements = list;
            this.nextOffest = l12;
        }

        @k
        public final List<com.avito.android.ai_assistant.generated.api.list.a> a() {
            return this.elements;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Long getNextOffest() {
            return this.nextOffest;
        }
    }
}
