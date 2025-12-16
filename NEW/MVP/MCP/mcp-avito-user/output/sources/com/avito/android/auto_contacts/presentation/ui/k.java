package com.avito.android.auto_contacts.presentation.ui;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.auto_contacts.domain.models.AutoButton;
import com.avito.android.auto_contacts.domain.models.AutoContactsPackage;
import com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ContactPackagesScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f94990l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12) {
        super(2);
        this.f94990l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f94990l | 1);
        B bE2 = a12.E(-1586613561);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            r.a(R1.c(0.0f, 0.0f, 3), new AutoContactsPackagesState("27 contacts package for Automobiles is active", "Use these contacts until due date. Or they transform into dust but don't worry you can always buy some more ;)", C42745f0.U(new AutoContactsPackage("Package 1", "Активируется, когда закончится предыдущий"), new AutoContactsPackage("Package 2", "Активируется, когда закончится предыдущий"), new AutoContactsPackage("Package 3", "Активируется, когда закончится предыдущий"), new AutoContactsPackage("Package 4", "Активируется, когда закончится предыдущий"), new AutoContactsPackage("Package 5", "Активируется, когда закончится предыдущий")), new AutoButton("Cool button", "buttonOutlineMedium", new EmptyDeepLink())), bE2, 70);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(iA2);
        }
        return G0.f406611a;
    }
}
