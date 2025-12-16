package com.avito.android.lib.deprecated_design.tab.adapter;

import Y61.l;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: BaseTabItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/adapter/BaseTabItem;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "Landroid/os/Parcelable;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class BaseTabItem implements com.avito.android.lib.deprecated_design.tab.a, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f178140b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f178141c;

    public BaseTabItem(@Y61.k String str, @l Integer num) {
        this.f178140b = str;
        this.f178141c = num;
    }

    @l
    /* renamed from: c, reason: from getter */
    public Integer getF178141c() {
        return this.f178141c;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @l
    public final String getLabel() {
        Integer f178141c = getF178141c();
        if (f178141c != null) {
            return f178141c.toString();
        }
        return null;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public String getF178140b() {
        return this.f178140b;
    }
}
