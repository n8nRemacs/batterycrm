package com.avito.android.verification.list_items.image;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.UniversalImage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/list_items/image/ImageItem;", "Lcom/avito/conveyor_item/a;", "Align", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324812b;

    /* renamed from: c, reason: collision with root package name */
    public final int f324813c;

    /* renamed from: d, reason: collision with root package name */
    public final int f324814d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Align f324815e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UniversalImage f324816f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/image/ImageItem$Align;", "", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Align {

        /* renamed from: b, reason: collision with root package name */
        public static final Align f324817b;

        /* renamed from: c, reason: collision with root package name */
        public static final Align f324818c;

        /* renamed from: d, reason: collision with root package name */
        public static final Align f324819d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Align[] f324820e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f324821f;

        static {
            Align align = new Align("LEFT", 0);
            f324817b = align;
            Align align2 = new Align("RIGHT", 1);
            f324818c = align2;
            Align align3 = new Align("CENTER", 2);
            f324819d = align3;
            Align[] alignArr = {align, align2, align3};
            f324820e = alignArr;
            f324821f = kotlin.enums.c.a(alignArr);
        }

        public Align() {
            throw null;
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) f324820e.clone();
        }
    }

    public ImageItem(String str, int i12, int i13, Align align, UniversalImage universalImage, int i14, C42822w c42822w) {
        this.f324812b = (i14 & 1) != 0 ? UUID.randomUUID().toString() : str;
        this.f324813c = i12;
        this.f324814d = i13;
        this.f324815e = align;
        this.f324816f = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageItem)) {
            return false;
        }
        ImageItem imageItem = (ImageItem) obj;
        return L.f(this.f324812b, imageItem.f324812b) && this.f324813c == imageItem.f324813c && this.f324814d == imageItem.f324814d && this.f324815e == imageItem.f324815e && L.f(this.f324816f, imageItem.f324816f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return getF302049b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302049b() {
        return this.f324812b;
    }

    public final int hashCode() {
        return this.f324816f.hashCode() + ((this.f324815e.hashCode() + r.e(this.f324814d, r.e(this.f324813c, this.f324812b.hashCode() * 31, 31), 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageItem(stringId=");
        sb2.append(this.f324812b);
        sb2.append(", width=");
        sb2.append(this.f324813c);
        sb2.append(", height=");
        sb2.append(this.f324814d);
        sb2.append(", align=");
        sb2.append(this.f324815e);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f324816f, ')');
    }
}
