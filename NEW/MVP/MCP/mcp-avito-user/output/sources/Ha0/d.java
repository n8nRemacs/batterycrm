package HA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiAddSellerAddressInfoV2Response.kt */
@P
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b(\u0010\u001bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"LHA0/d;", "", "", "LHA0/e;", "details", "", "esid", "LHA0/g;", "hideAddressDetails", "Lcom/avito/android/remote/model/text/AttributedText;", "legal", "", "maxSelectedTypes", "LHA0/a;", "required", "title", "LHA0/c;", "types", "LHA0/b;", "workingHours", "<init>", "(Ljava/util/List;Ljava/lang/String;LHA0/g;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Long;LHA0/a;Ljava/lang/String;Ljava/util/List;LHA0/b;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LHA0/g;", "c", "()LHA0/g;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Long;", "getMaxSelectedTypes", "()Ljava/lang/Long;", "LHA0/a;", "e", "()LHA0/a;", "getTitle", "f", "LHA0/b;", "g", "()LHA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    @com.google.gson.annotations.c("details")
    @l
    private final List<e> details;

    @com.google.gson.annotations.c("esid")
    @k
    private final String esid;

    @com.google.gson.annotations.c("hideAddressDetails")
    @l
    private final g hideAddressDetails;

    @com.google.gson.annotations.c("legal")
    @l
    private final AttributedText legal;

    @com.google.gson.annotations.c("maxSelectedTypes")
    @l
    private final Long maxSelectedTypes;

    @com.google.gson.annotations.c("required")
    @l
    private final a required;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("types")
    @k
    private final List<c> types;

    @com.google.gson.annotations.c("workingHours")
    @k
    private final b workingHours;

    public d(@l List<e> list, @k String str, @l g gVar, @l AttributedText attributedText, @l Long l12, @l a aVar, @k String str2, @k List<c> list2, @k b bVar) {
        this.details = list;
        this.esid = str;
        this.hideAddressDetails = gVar;
        this.legal = attributedText;
        this.maxSelectedTypes = l12;
        this.required = aVar;
        this.title = str2;
        this.types = list2;
        this.workingHours = bVar;
    }

    @l
    public final List<e> a() {
        return this.details;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getEsid() {
        return this.esid;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final g getHideAddressDetails() {
        return this.hideAddressDetails;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getLegal() {
        return this.legal;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final a getRequired() {
        return this.required;
    }

    @k
    public final List<c> f() {
        return this.types;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final b getWorkingHours() {
        return this.workingHours;
    }
}
