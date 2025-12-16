package com.avito.android.beduin.common.actionhandler.option_selector.konveyor;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/option_selector/konveyor/a;", "Lcom/avito/conveyor_item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f100325b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100326c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f100327d;

    public a(@k String str, boolean z12, @k String str2) {
        this.f100325b = str;
        this.f100326c = z12;
        this.f100327d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f100325b, aVar.f100325b) && this.f100326c == aVar.f100326c && L.f(this.f100327d, aVar.f100327d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF100325b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF100325b() {
        return this.f100325b;
    }

    public final int hashCode() {
        return this.f100327d.hashCode() + r.i(this.f100325b.hashCode() * 31, 31, this.f100326c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionItem(stringId=");
        sb2.append(this.f100325b);
        sb2.append(", isSelected=");
        sb2.append(this.f100326c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f100327d, ')');
    }
}
