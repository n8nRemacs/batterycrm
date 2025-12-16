package com.avito.android.publish.details;

import com.avito.android.publish.details.K1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PublishDetailsSlotValidator.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0010!\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072:\u0010\u0006\u001a6\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001 \u0005*\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0003¢\u0006\u0002\b\u00040\u0000¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "", "", "Lj41/e;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class A1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33806y1 f232617b;

    public A1(C33806y1 c33806y1) {
        this.f232617b = c33806y1;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str;
        for (Map.Entry entry : (List) obj) {
            if (entry != null && (str = (String) entry.getValue()) != null) {
                this.f232617b.f235098h.setValue(new K1.AbstractC33668b.j(str));
            }
        }
    }
}
