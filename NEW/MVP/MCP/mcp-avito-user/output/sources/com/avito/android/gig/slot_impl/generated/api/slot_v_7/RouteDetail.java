package com.avito.android.gig.slot_impl.generated.api.slot_v_7;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail;", "", "", "title", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail$Type;", "type", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail$Type;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail$Type;", "b", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail$Type;", "c", "Type", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RouteDetail {

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final Type type;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlotV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "WebView", "ExternalFile", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("externalFile")
        public static final Type ExternalFile;

        @c("webView")
        public static final Type WebView;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f159477b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159478c;

        static {
            Type type = new Type("WebView", 0, "webView");
            WebView = type;
            Type type2 = new Type("ExternalFile", 1, "externalFile");
            ExternalFile = type2;
            Type[] typeArr = {type, type2};
            f159477b = typeArr;
            f159478c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f159477b.clone();
        }
    }

    public RouteDetail(@k String str, @k Type type, @k String str2) {
        this.title = str;
        this.type = type;
        this.url = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
