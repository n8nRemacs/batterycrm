package com.avito.android.bottom_navigation;

import Oj.InterfaceC14702a;
import Rj.C15047a;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import ur.InterfaceC49101b;

/* compiled from: NavigationTabSetProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/G;", "", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f106934a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14702a f106935b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C15047a f106936c;

    /* compiled from: NavigationTabSetProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public G(@Y61.k InterfaceC49101b interfaceC49101b, @Y61.k InterfaceC14702a interfaceC14702a, @Y61.k C15047a c15047a) {
        this.f106934a = interfaceC49101b;
        this.f106935b = interfaceC14702a;
        this.f106936c = c15047a;
    }

    @Y61.k
    public final F a(@Y61.k BottomNavigationSpace bottomNavigationSpace) {
        if (this.f106934a.c()) {
            GlobalNavigationTab globalNavigationTab = GlobalNavigationTab.f106937f;
            GlobalNavigationTab globalNavigationTab2 = GlobalNavigationTab.f106938g;
            C15047a c15047a = this.f106936c;
            c15047a.getClass();
            kotlin.reflect.n<Object> nVar = C15047a.f14573m[10];
            return new F(C42745f0.U(globalNavigationTab, globalNavigationTab2, ((Boolean) c15047a.f14584l.a().invoke()).booleanValue() ? GlobalNavigationTab.f106940i : GlobalNavigationTab.f106939h, GlobalNavigationTab.f106941j, GlobalNavigationTab.f106942k));
        }
        int iOrdinal = bottomNavigationSpace.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new F(C42756l.B(new NavigationTab[]{NavigationTab.f106975k, NavigationTab.f106971g, NavigationTab.f106972h, NavigationTab.f106973i, NavigationTab.f106974j}));
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC14702a interfaceC14702a = this.f106935b;
        if (interfaceC14702a.b().f439745a.f439749b.a()) {
            interfaceC14702a.b().b();
        }
        return new F(C42756l.B(new NavigationTab[]{NavigationTab.f106970f, NavigationTab.f106971g, NavigationTab.f106972h, NavigationTab.f106973i, interfaceC14702a.b().f439745a.f439749b.b() ? NavigationTab.f106976l : null, NavigationTab.f106974j}));
    }
}
