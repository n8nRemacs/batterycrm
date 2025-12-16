package com.avito.android.bbl.generated.api.api_2_bbl_configure;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import sh.C48171b;
import sh.C48179j;

/* compiled from: Api2BblConfigureResponse.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001!B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/avito/android/bbl/generated/api/api_2_bbl_configure/BblConfigureConfig;", "", "Lsh/b;", "bblDelta", "", "id", "", "isSelected", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lsh/j;", "universalImage", "Lcom/avito/android/bbl/generated/api/api_2_bbl_configure/BblConfigureConfig$Width;", "width", "<init>", "(Lsh/b;JZLcom/avito/android/remote/model/text/AttributedText;Lsh/j;Lcom/avito/android/bbl/generated/api/api_2_bbl_configure/BblConfigureConfig$Width;)V", "Lsh/b;", "getBblDelta", "()Lsh/b;", "J", "getId", "()J", "Z", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lsh/j;", "getUniversalImage", "()Lsh/j;", "Lcom/avito/android/bbl/generated/api/api_2_bbl_configure/BblConfigureConfig$Width;", "getWidth", "()Lcom/avito/android/bbl/generated/api/api_2_bbl_configure/BblConfigureConfig$Width;", "Width", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BblConfigureConfig {

    @c("bblDelta")
    @k
    private final C48171b bblDelta;

    @c("id")
    private final long id;

    @c("isSelected")
    private final boolean isSelected;

    @c("text")
    @k
    private final AttributedText text;

    @c("universalImage")
    @l
    private final C48179j universalImage;

    @c("width")
    @l
    private final Width width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2BblConfigureResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/bbl/generated/api/api_2_bbl_configure/BblConfigureConfig$Width;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Half", "Full", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Width {

        @c("full")
        public static final Width Full;

        @c("half")
        public static final Width Half;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Width[] f99076b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f99077c;

        static {
            Width width = new Width("Half", 0, "half");
            Half = width;
            Width width2 = new Width("Full", 1, "full");
            Full = width2;
            Width[] widthArr = {width, width2};
            f99076b = widthArr;
            f99077c = kotlin.enums.c.a(widthArr);
        }

        private Width(String str, int i12, String str2) {
        }

        public static Width valueOf(String str) {
            return (Width) Enum.valueOf(Width.class, str);
        }

        public static Width[] values() {
            return (Width[]) f99076b.clone();
        }
    }

    public BblConfigureConfig(@k C48171b c48171b, long j12, boolean z12, @k AttributedText attributedText, @l C48179j c48179j, @l Width width) {
        this.bblDelta = c48171b;
        this.id = j12;
        this.isSelected = z12;
        this.text = attributedText;
        this.universalImage = c48179j;
        this.width = width;
    }
}
