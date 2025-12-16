package androidx.media3.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.V;
import androidx.media3.common.text.a;
import androidx.media3.common.util.C23114e;
import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;
import com.google.common.collect.AbstractC37401r1;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class S implements InterfaceC23096j.a, androidx.media3.datasource.cache.e, r.a, r.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47444b;

    public /* synthetic */ S(int i12) {
        this.f47444b = i12;
    }

    public static int b(Matcher matcher, int i12, int i13) {
        String strGroup = matcher.group(i12);
        strGroup.getClass();
        return Integer.parseInt(strGroup, i13);
    }

    public static void d(int i12, Integer num, String str, String str2, HashMap map) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i12));
    }

    public static void e(int i12, HashMap map, String str, int i13, String str2) {
        map.put(str, Integer.valueOf(i12));
        map.put(str2, Integer.valueOf(i13));
    }

    @Override // androidx.media3.datasource.cache.e
    public String a(androidx.media3.datasource.o oVar) {
        String str = oVar.f48252h;
        return str != null ? str : oVar.f48245a.toString();
    }

    @Override // androidx.media3.common.util.r.b
    public void c(Object obj, C23107s c23107s) {
    }

    @Override // androidx.media3.common.InterfaceC23096j.a
    public InterfaceC23096j fromBundle(Bundle bundle) {
        switch (this.f47444b) {
            case 0:
                Bundle bundle2 = bundle.getBundle(T.f47451d);
                bundle2.getClass();
                Q q12 = (Q) Q.f47438i.fromBundle(bundle2);
                int[] intArray = bundle.getIntArray(T.f47452e);
                intArray.getClass();
                return new T(q12, com.google.common.primitives.l.a(intArray));
            case 1:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(V.f47536d);
                return new V(parcelableArrayList == null ? AbstractC37401r1.C() : C23114e.a(V.a.f47543k, parcelableArrayList));
            case 2:
                String str = V.a.f47539g;
                C23088b c23088b = Q.f47438i;
                Bundle bundle3 = bundle.getBundle(V.a.f47539g);
                bundle3.getClass();
                Q q13 = (Q) c23088b.fromBundle(bundle3);
                int[] intArray2 = bundle.getIntArray(V.a.f47540h);
                int i12 = q13.f47439b;
                return new V.a(q13, bundle.getBoolean(V.a.f47542j, false), (int[]) com.google.common.base.D.a(intArray2, new int[i12]), (boolean[]) com.google.common.base.D.a(bundle.getBooleanArray(V.a.f47541i), new boolean[i12]));
            case 3:
                return new X(bundle.getInt(X.f47550g, 0), bundle.getInt(X.f47551h, 0), bundle.getInt(X.f47552i, 0), bundle.getFloat(X.f47553j, 1.0f));
            case 4:
                androidx.media3.common.text.a aVar = androidx.media3.common.text.a.f47814s;
                a.c cVar = new a.c();
                CharSequence charSequence = bundle.getCharSequence(androidx.media3.common.text.a.f47815t);
                if (charSequence != null) {
                    cVar.f47839a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(androidx.media3.common.text.a.f47816u);
                if (alignment != null) {
                    cVar.f47841c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(androidx.media3.common.text.a.f47817v);
                if (alignment2 != null) {
                    cVar.f47842d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(androidx.media3.common.text.a.f47818w);
                if (bitmap != null) {
                    cVar.f47840b = bitmap;
                }
                String str2 = androidx.media3.common.text.a.f47819x;
                if (bundle.containsKey(str2)) {
                    String str3 = androidx.media3.common.text.a.f47820y;
                    if (bundle.containsKey(str3)) {
                        float f12 = bundle.getFloat(str2);
                        int i13 = bundle.getInt(str3);
                        cVar.f47843e = f12;
                        cVar.f47844f = i13;
                    }
                }
                String str4 = androidx.media3.common.text.a.f47821z;
                if (bundle.containsKey(str4)) {
                    cVar.f47845g = bundle.getInt(str4);
                }
                String str5 = androidx.media3.common.text.a.f47803A;
                if (bundle.containsKey(str5)) {
                    cVar.f47846h = bundle.getFloat(str5);
                }
                String str6 = androidx.media3.common.text.a.f47804B;
                if (bundle.containsKey(str6)) {
                    cVar.f47847i = bundle.getInt(str6);
                }
                String str7 = androidx.media3.common.text.a.f47806D;
                if (bundle.containsKey(str7)) {
                    String str8 = androidx.media3.common.text.a.f47805C;
                    if (bundle.containsKey(str8)) {
                        float f13 = bundle.getFloat(str7);
                        int i14 = bundle.getInt(str8);
                        cVar.f47849k = f13;
                        cVar.f47848j = i14;
                    }
                }
                String str9 = androidx.media3.common.text.a.f47807E;
                if (bundle.containsKey(str9)) {
                    cVar.f47850l = bundle.getFloat(str9);
                }
                String str10 = androidx.media3.common.text.a.f47808F;
                if (bundle.containsKey(str10)) {
                    cVar.f47851m = bundle.getFloat(str10);
                }
                String str11 = androidx.media3.common.text.a.f47809G;
                if (bundle.containsKey(str11)) {
                    cVar.f47853o = bundle.getInt(str11);
                    cVar.f47852n = true;
                }
                if (!bundle.getBoolean(androidx.media3.common.text.a.f47810H, false)) {
                    cVar.f47852n = false;
                }
                String str12 = androidx.media3.common.text.a.f47811I;
                if (bundle.containsKey(str12)) {
                    cVar.f47854p = bundle.getInt(str12);
                }
                String str13 = androidx.media3.common.text.a.f47812J;
                if (bundle.containsKey(str13)) {
                    cVar.f47855q = bundle.getFloat(str13);
                }
                return cVar.a();
            default:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(androidx.media3.common.text.b.f47857e);
                return new androidx.media3.common.text.b(parcelableArrayList2 == null ? AbstractC37401r1.C() : C23114e.a(androidx.media3.common.text.a.f47813K, parcelableArrayList2), bundle.getLong(androidx.media3.common.text.b.f47858f));
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        androidx.media3.exoplayer.analytics.b bVar = (androidx.media3.exoplayer.analytics.b) obj;
        switch (this.f47444b) {
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            case 13:
                bVar.getClass();
                break;
            case 14:
                bVar.getClass();
                break;
            case 15:
                bVar.getClass();
                break;
            case 16:
                bVar.getClass();
                break;
            case 17:
                bVar.getClass();
                break;
            case 18:
                bVar.getClass();
                break;
            case 19:
                bVar.getClass();
                break;
            case 20:
                bVar.getClass();
                break;
            case 21:
                bVar.getClass();
                break;
            case 22:
                bVar.getClass();
                break;
            case 23:
                bVar.getClass();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                bVar.getClass();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                bVar.getClass();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                bVar.getClass();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ S(b.C1823b c1823b, int i12) {
        this.f47444b = i12;
    }
}
