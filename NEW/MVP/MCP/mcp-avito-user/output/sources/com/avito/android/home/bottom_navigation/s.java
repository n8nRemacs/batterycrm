package com.avito.android.home.bottom_navigation;

import Vj.InterfaceC15686a;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BottomNavigationSpaceEnvironmentProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/bottom_navigation/s;", "LVj/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements InterfaceC15686a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bottom_navigation.space.a f162360a;

    /* compiled from: BottomNavigationSpaceEnvironmentProviderImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162361a;

        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace2 = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f162361a = iArr;
        }
    }

    @Inject
    public s(@Y61.k com.avito.android.bottom_navigation.space.a aVar) {
        this.f162360a = aVar;
    }

    @Override // Vj.InterfaceC15686a
    @Y61.l
    public final String a() {
        BottomNavigationSpace bottomNavigationSpaceN = this.f162360a.n();
        int i12 = bottomNavigationSpaceN == null ? -1 : a.f162361a[bottomNavigationSpaceN.ordinal()];
        if (i12 == 1 || i12 != 2) {
            return null;
        }
        return "avitoForBusiness";
    }
}
