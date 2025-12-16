package com.avito.android.mnz_common.ui.compose.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.foundation.p;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MnzFloatingFooterCompose.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mnz_common/ui/compose/model/e;", "", "a", "b", "Lcom/avito/android/mnz_common/ui/compose/model/e$a;", "Lcom/avito/android/mnz_common/ui/compose/model/e$b;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AttributedText f198013a;

    /* renamed from: b, reason: collision with root package name */
    public final float f198014b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final p f198015c;

    /* compiled from: MnzFloatingFooterCompose.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mnz_common/ui/compose/model/e$a;", "Lcom/avito/android/mnz_common/ui/compose/model/e;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: d, reason: collision with root package name */
        public final long f198016d;

        /* renamed from: e, reason: collision with root package name */
        public final float f198017e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final AttributedText f198018f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final p f198019g;

        public /* synthetic */ a(long j12, float f12, AttributedText attributedText, p pVar, int i12, C42822w c42822w) {
            this(j12, f12, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : pVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f198016d == aVar.f198016d && Float.compare(this.f198017e, aVar.f198017e) == 0 && L.f(this.f198018f, aVar.f198018f) && L.f(this.f198019g, aVar.f198019g);
        }

        public final int hashCode() {
            int iD2 = r.d(this.f198017e, Long.hashCode(this.f198016d) * 31, 31);
            AttributedText attributedText = this.f198018f;
            int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            p pVar = this.f198019g;
            return iHashCode + (pVar != null ? pVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Count(count=" + this.f198016d + ", progress=" + this.f198017e + ", text=" + this.f198018f + ", color=" + this.f198019g + ')';
        }

        public a(long j12, float f12, @l AttributedText attributedText, @l p pVar) {
            super(attributedText, f12, pVar, null);
            this.f198016d = j12;
            this.f198017e = f12;
            this.f198018f = attributedText;
            this.f198019g = pVar;
        }
    }

    /* compiled from: MnzFloatingFooterCompose.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mnz_common/ui/compose/model/e$b;", "Lcom/avito/android/mnz_common/ui/compose/model/e;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: d, reason: collision with root package name */
        public final int f198020d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f198021e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final p f198022f;

        public /* synthetic */ b(int i12, AttributedText attributedText, p pVar, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? null : attributedText, (i13 & 4) != 0 ? null : pVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f198020d == bVar.f198020d && L.f(this.f198021e, bVar.f198021e) && L.f(this.f198022f, bVar.f198022f);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f198020d) * 31;
            AttributedText attributedText = this.f198021e;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            p pVar = this.f198022f;
            return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Icon(iconRes=" + this.f198020d + ", text=" + this.f198021e + ", color=" + this.f198022f + ')';
        }

        public b(@InterfaceC42165v int i12, @l AttributedText attributedText, @l p pVar) {
            super(attributedText, 1.0f, pVar, null);
            this.f198020d = i12;
            this.f198021e = attributedText;
            this.f198022f = pVar;
        }
    }

    public e(AttributedText attributedText, float f12, p pVar, C42822w c42822w) {
        this.f198013a = attributedText;
        this.f198014b = f12;
        this.f198015c = pVar;
    }
}
