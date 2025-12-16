package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.PeerConnectionFactory;

/* compiled from: PublishAnonymousNumber.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/PublishAnonymousNumber;", "", "()V", "Empty", PeerConnectionFactory.TRIAL_ENABLED, "Required", "Lcom/avito/android/remote/model/PublishAnonymousNumber$Empty;", "Lcom/avito/android/remote/model/PublishAnonymousNumber$Enabled;", "Lcom/avito/android/remote/model/PublishAnonymousNumber$Required;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PublishAnonymousNumber {

    /* compiled from: PublishAnonymousNumber.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/PublishAnonymousNumber$Empty;", "Lcom/avito/android/remote/model/PublishAnonymousNumber;", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Empty extends PublishAnonymousNumber {

        @k
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }

    /* compiled from: PublishAnonymousNumber.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/PublishAnonymousNumber$Enabled;", "Lcom/avito/android/remote/model/PublishAnonymousNumber;", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "value", "", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Z)V", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "getValue", "()Z", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Enabled extends PublishAnonymousNumber {

        @c("description")
        @k
        private final AttributedText description;

        @c("title")
        @k
        private final String title;

        @c("value")
        private final boolean value;

        public Enabled(@k AttributedText attributedText, @k String str, boolean z12) {
            super(null);
            this.description = attributedText;
            this.title = str;
            this.value = z12;
        }

        @k
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final boolean getValue() {
            return this.value;
        }
    }

    /* compiled from: PublishAnonymousNumber.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/PublishAnonymousNumber$Required;", "Lcom/avito/android/remote/model/PublishAnonymousNumber;", "newDesign", "", "(Ljava/lang/Boolean;)V", "isNewDesign", "()Z", "getNewDesign", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Required extends PublishAnonymousNumber {

        @c("newDesign")
        @l
        private final Boolean newDesign;

        public Required(@l Boolean bool) {
            super(null);
            this.newDesign = bool;
        }

        @l
        public final Boolean getNewDesign() {
            return this.newDesign;
        }

        public final boolean isNewDesign() {
            return L.f(this.newDesign, Boolean.TRUE);
        }
    }

    public /* synthetic */ PublishAnonymousNumber(C42822w c42822w) {
        this();
    }

    private PublishAnonymousNumber() {
    }
}
