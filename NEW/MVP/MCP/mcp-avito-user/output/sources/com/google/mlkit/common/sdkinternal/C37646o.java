package com.google.mlkit.common.sdkinternal;

import VX0.d;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.mlkit_common.zzas;
import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.tasks.InterfaceC37023f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* renamed from: com.google.mlkit.common.sdkinternal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37646o {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    @RX0.a
    public static final Feature[] f362376a = new Feature[0];

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @RX0.a
    public static final Feature f362377b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzat f362378c;

    /* renamed from: d, reason: collision with root package name */
    public static final zzat f362379d;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        f362377b = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        new Feature("mlkit.ocr.chinese", 1L);
        new Feature("mlkit.ocr.common", 1L);
        new Feature("mlkit.ocr.devanagari", 1L);
        new Feature("mlkit.ocr.japanese", 1L);
        new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        new Feature("mlkit.image.caption", 1L);
        new Feature("mlkit.docscan.detect", 1L);
        new Feature("mlkit.docscan.crop", 1L);
        new Feature("mlkit.docscan.enhance", 1L);
        new Feature("mlkit.docscan.ui", 1L);
        new Feature("mlkit.docscan.stain", 1L);
        new Feature("mlkit.docscan.shadow", 1L);
        new Feature("mlkit.quality.aesthetic", 1L);
        new Feature("mlkit.quality.technical", 1L);
        new Feature("mlkit.segmentation.subject", 1L);
        zzas zzasVar = new zzas();
        zzasVar.zza("barcode", feature);
        zzasVar.zza("custom_ica", feature2);
        zzasVar.zza("face", feature3);
        zzasVar.zza("ica", feature4);
        zzasVar.zza("ocr", feature5);
        zzasVar.zza("langid", feature6);
        zzasVar.zza("nlclassifier", feature7);
        zzasVar.zza("tflite_dynamite", feature8);
        zzasVar.zza("barcode_ui", feature9);
        zzasVar.zza("smart_reply", feature10);
        f362378c = zzasVar.zzb();
        zzas zzasVar2 = new zzas();
        zzasVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzasVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzasVar2.zza("com.google.android.gms.vision.face", feature3);
        zzasVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzasVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzasVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzasVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzasVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzasVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        f362379d = zzasVar2.zzb();
    }

    @RX0.a
    @Deprecated
    public static void a(@j.N Context context, @j.N List<String> list) {
        C36688g.f349289b.getClass();
        if (C36688g.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        final Feature[] featureArrB = b(f362378c, list);
        d.a aVar = new d.a();
        com.google.android.gms.common.api.k kVar = new com.google.android.gms.common.api.k() { // from class: com.google.mlkit.common.sdkinternal.F
            @Override // com.google.android.gms.common.api.k
            public final Feature[] a() {
                Feature[] featureArr = C37646o.f362376a;
                return featureArrB;
            }
        };
        ArrayList arrayList = aVar.f17186a;
        arrayList.add(kVar);
        new com.google.android.gms.common.moduleinstall.internal.A(context, com.google.android.gms.common.moduleinstall.internal.A.f349511k, C36616a.d.f348913j2, h.a.f348930c).e(new VX0.d(arrayList, null, null, true, null)).e(new InterfaceC37023f() { // from class: com.google.mlkit.common.sdkinternal.G
            @Override // com.google.android.gms.tasks.InterfaceC37023f
            public final void onFailure(Exception exc) {
            }
        });
    }

    public static Feature[] b(zzat zzatVar, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            Feature feature = (Feature) zzatVar.get(list.get(i12));
            C36729v.j(feature);
            featureArr[i12] = feature;
        }
        return featureArr;
    }
}
