package com.avito.android.home.tags_item;

import Y61.l;
import android.os.Parcelable;
import com.avito.android.serp.adapter.home_section_tab.SectionTag;
import com.avito.android.serp.adapter.home_section_tab.SectionTagsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SectionTagsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/tags_item/g;", "Lcom/avito/android/home/tags_item/d;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final js0.b f162502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f162503c = f2.b(0, 1, BufferOverflow.f410778c, 1);

    /* renamed from: d, reason: collision with root package name */
    @l
    public j f162504d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Parcelable f162505e;

    @Inject
    public g(@Y61.k js0.b bVar) {
        this.f162502b = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        SectionTagsItem sectionTagsItem = (SectionTagsItem) aVar;
        this.f162504d = jVar;
        jVar.qY(sectionTagsItem, this.f162505e, new e(this));
        jVar.d(new f(this, jVar));
        List<SectionTag> list = sectionTagsItem.f270152d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SectionTag) it.next()).f270146d);
        }
        this.f162502b.d(arrayList);
    }

    @Override // com.avito.android.home.tags_item.d
    public final void cc() {
        j jVar = this.f162504d;
        if (jVar != null) {
            jVar.cc();
        }
    }

    @Override // com.avito.android.home.tags_item.d
    public final void dc(@Y61.k SectionTag sectionTag) {
        String str;
        this.f162502b.k(sectionTag.f270146d, "widget");
        boolean z12 = sectionTag.f270149g;
        if (z12) {
            sectionTag = (!z12 || (str = sectionTag.f270148f) == null) ? null : SectionTag.a(sectionTag, str, false, 53);
        }
        if (sectionTag != null) {
            this.f162503c.K5(sectionTag);
        }
        j jVar = this.f162504d;
        if (jVar != null) {
            jVar.cc();
        }
    }

    @Override // com.avito.android.home.tags_item.d
    @Y61.k
    public final d2<SectionTag> ec() {
        return C43175k.a(this.f162503c);
    }
}
