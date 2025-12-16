package com.avito.android.actions_sheet;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import com.akita.compose.component.button.t;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.C30060h5;
import com.avito.android.di.module.C30065i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.util.L3;
import dagger.internal.l;
import dagger.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class a {
    public static Iterator A(List list, Parcel parcel, int i12) {
        parcel.writeInt(i12);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void B(Parcel parcel, int i12, Float f12) {
        parcel.writeInt(i12);
        parcel.writeFloat(f12.floatValue());
    }

    public static void C(Parcel parcel, int i12, Integer num) {
        parcel.writeInt(i12);
        parcel.writeInt(num.intValue());
    }

    public static u D(l lVar, u uVar) {
        return dagger.internal.g.d(new C30065i(uVar, lVar));
    }

    public static int a(int i12, int i13, UniversalImage universalImage) {
        return (universalImage.hashCode() + i12) * i13;
    }

    public static int b(int i12, int i13, AttributedText attributedText) {
        return (attributedText.hashCode() + i12) * i13;
    }

    public static int c(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i12, int i13) {
        arrayList.add(creator.createFromParcel(parcel));
        return i12 + i13;
    }

    public static int d(View view, int i12) {
        return view.getContext().getResources().getDimensionPixelSize(i12);
    }

    public static int e(DeepLink deepLink, int i12, int i13) {
        return (deepLink.hashCode() + i12) * i13;
    }

    public static int f(PrintableText printableText, int i12, int i13) {
        return (printableText.hashCode() + i12) * i13;
    }

    public static int g(Image image, int i12, int i13) {
        return (image.hashCode() + i12) * i13;
    }

    public static int h(SerpDisplayType serpDisplayType, int i12, int i13) {
        return (serpDisplayType.hashCode() + i12) * i13;
    }

    public static int i(UniversalColor universalColor, int i12, int i13) {
        return (universalColor.hashCode() + i12) * i13;
    }

    public static int j(SerpViewType serpViewType, int i12, int i13) {
        return (serpViewType.hashCode() + i12) * i13;
    }

    public static int k(L3 l32, int i12, int i13) {
        return (l32.hashCode() + i12) * i13;
    }

    public static int l(Class cls, Parcel parcel, ArrayList arrayList, int i12, int i13) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i12 + i13;
    }

    public static Bundle m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static C22039c2 n(B b12, boolean z12, boolean z13) {
        b12.X(z12);
        b12.X(z13);
        return b12.Z();
    }

    public static t o(com.akita.compose.theme.re23.b bVar, A a12) {
        bVar.getClass();
        return com.akita.compose.theme.re23.b.c(a12).f2();
    }

    public static J p(com.akita.compose.theme.re23.b bVar, B b12) {
        bVar.getClass();
        return com.akita.compose.theme.re23.b.u(b12).getError();
    }

    public static Image q(View view, UniversalImage universalImage) {
        return UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(view.getContext()));
    }

    public static com.avito.konveyor.util.b r(com.avito.konveyor.util.c cVar) {
        cVar.getClass();
        return new com.avito.konveyor.util.b();
    }

    public static u s(l lVar, u uVar) {
        return dagger.internal.g.d(new C30060h5(uVar, lVar));
    }

    public static String t(StringBuilder sb2, Uri uri, char c12) {
        sb2.append(uri);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String u(StringBuilder sb2, NavigationTabSetItem navigationTabSetItem, char c12) {
        sb2.append(navigationTabSetItem);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String v(StringBuilder sb2, DeepLink deepLink, char c12) {
        sb2.append(deepLink);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String w(StringBuilder sb2, AttributedText attributedText, char c12) {
        sb2.append(attributedText);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String x(StringBuilder sb2, SerpViewType serpViewType, char c12) {
        sb2.append(serpViewType);
        sb2.append(c12);
        return sb2.toString();
    }

    public static Iterator y(Parcel parcel, int i12, ArrayList arrayList) {
        parcel.writeInt(i12);
        parcel.writeInt(arrayList.size());
        return arrayList.iterator();
    }

    public static Iterator z(ArrayList arrayList, Parcel parcel) {
        parcel.writeInt(arrayList.size());
        return arrayList.iterator();
    }
}
