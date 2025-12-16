package com.avito.android.verification.common.list.modern_status;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModernStatusItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/common/list/modern_status/ModernStatusItem;", "Lcom/avito/conveyor_item/a;", "Status", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ModernStatusItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323415b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323416c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f323417d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Status f323418e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f323419f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalImage f323420g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModernStatusItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/common/list/modern_status/ModernStatusItem$Status;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f323421b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f323422c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f323423d;

        /* renamed from: e, reason: collision with root package name */
        public static final Status f323424e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Status[] f323425f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f323426g;

        static {
            Status status = new Status("DEFAULT", 0);
            f323421b = status;
            Status status2 = new Status("PENDING", 1);
            f323422c = status2;
            Status status3 = new Status("SUCCESS", 2);
            f323423d = status3;
            Status status4 = new Status("ERROR", 3);
            f323424e = status4;
            Status[] statusArr = {status, status2, status3, status4};
            f323425f = statusArr;
            f323426g = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f323425f.clone();
        }
    }

    public ModernStatusItem(@k String str, @k String str2, @k AttributedText attributedText, @k Status status, @l DeepLink deepLink, @l UniversalImage universalImage) {
        this.f323415b = str;
        this.f323416c = str2;
        this.f323417d = attributedText;
        this.f323418e = status;
        this.f323419f = deepLink;
        this.f323420g = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModernStatusItem)) {
            return false;
        }
        ModernStatusItem modernStatusItem = (ModernStatusItem) obj;
        return L.f(this.f323415b, modernStatusItem.f323415b) && L.f(this.f323416c, modernStatusItem.f323416c) && L.f(this.f323417d, modernStatusItem.f323417d) && this.f323418e == modernStatusItem.f323418e && L.f(this.f323419f, modernStatusItem.f323419f) && L.f(this.f323420g, modernStatusItem.f323420g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return getF294909b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294909b() {
        return this.f323415b;
    }

    public final int hashCode() {
        int iHashCode = (this.f323418e.hashCode() + com.avito.android.actions_sheet.a.b(H.d(this.f323415b.hashCode() * 31, 31, this.f323416c), 31, this.f323417d)) * 31;
        DeepLink deepLink = this.f323419f;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f323420g;
        return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModernStatusItem(stringId=");
        sb2.append(this.f323415b);
        sb2.append(", title=");
        sb2.append(this.f323416c);
        sb2.append(", subtitle=");
        sb2.append(this.f323417d);
        sb2.append(", status=");
        sb2.append(this.f323418e);
        sb2.append(", action=");
        sb2.append(this.f323419f);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f323420g, ')');
    }
}
