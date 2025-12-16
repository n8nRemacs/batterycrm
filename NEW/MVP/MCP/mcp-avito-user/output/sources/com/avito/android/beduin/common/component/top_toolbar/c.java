package com.avito.android.beduin.common.component.top_toolbar;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinTopToolbarComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/TopToolbarChange;", "change", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/top_toolbar/TopToolbarChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<TopToolbarChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f102813l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f102814m;

    /* compiled from: BeduinTopToolbarComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TopToolbarChange.values().length];
            try {
                iArr[TopToolbarChange.f102797c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TopToolbarChange.f102798d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, b bVar) {
        super(1);
        this.f102813l = hVar;
        this.f102814m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(TopToolbarChange topToolbarChange) {
        int iOrdinal = topToolbarChange.ordinal();
        h hVar = this.f102813l;
        b bVar = this.f102814m;
        if (iOrdinal == 0) {
            hVar.setTitle(bVar.f102806f.getTitle());
        } else if (iOrdinal == 1) {
            bVar.y(hVar);
        }
        return G0.f406611a;
    }
}
