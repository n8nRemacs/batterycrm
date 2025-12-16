package com.avito.android.rating_form.step;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.result.ActivityResult;
import com.avito.android.di.B;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.util.C35974x2;
import i.b;
import ih0.InterfaceC41402a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ActivityLauncherProvider.kt */
@B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/b;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WeakReference<RatingFormStepFragment> f249170a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view.s f249171b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC41402a, G0> f249172c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final androidx.view.result.h<Intent> f249173d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final androidx.view.result.h<Intent> f249174e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.view.result.h<Intent> f249175f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final androidx.view.result.h<Intent> f249176g;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@Y61.k WeakReference<RatingFormStepFragment> weakReference, @Y61.k com.avito.android.photo_list_view.s sVar, @Y61.k Y41.l<? super InterfaceC41402a, G0> lVar) {
        androidx.view.result.h<Intent> hVarRegisterForActivityResult;
        androidx.view.result.h<Intent> hVarRegisterForActivityResult2;
        androidx.view.result.h<Intent> hVarRegisterForActivityResult3;
        this.f249170a = weakReference;
        this.f249171b = sVar;
        this.f249172c = lVar;
        RatingFormStepFragment ratingFormStepFragment = weakReference.get();
        androidx.view.result.h<Intent> hVarRegisterForActivityResult4 = null;
        if (ratingFormStepFragment != null) {
            final int i12 = 0;
            hVarRegisterForActivityResult = ratingFormStepFragment.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.rating_form.step.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f249169c;

                {
                    this.f249169c = this;
                }

                @Override // androidx.view.result.a
                public final void a(Object obj) {
                    AddressParameter.Value value;
                    Bundle extras;
                    SelectParameter.Value value2;
                    String id2;
                    Bundle extras2;
                    Intent intent;
                    Uri data;
                    List<Uri> listA;
                    ActivityResult activityResult = (ActivityResult) obj;
                    switch (i12) {
                        case 0:
                            this.f249169c.f249171b.l(activityResult.f21242b == -1);
                            break;
                        case 1:
                            if (activityResult.f21242b == -1) {
                                Intent intent2 = activityResult.f21243c;
                                if (intent2 == null || (extras = intent2.getExtras()) == null) {
                                    value = null;
                                } else {
                                    value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : extras.getParcelable("EXTRA_ADDRESS_RESULT"));
                                }
                                this.f249169c.f249172c.invoke(new InterfaceC41402a.v(value));
                                break;
                            }
                            break;
                        case 2:
                            if (activityResult.f21242b == -1) {
                                Long lZ02 = null;
                                Intent intent3 = activityResult.f21243c;
                                if (intent3 == null || (extras2 = intent3.getExtras()) == null) {
                                    value2 = null;
                                } else {
                                    value2 = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras2.getParcelable("extra_value", SelectParameter.Value.class) : extras2.getParcelable("extra_value"));
                                }
                                if (value2 != null && (id2 = value2.getId()) != null) {
                                    lZ02 = C43066x.z0(id2);
                                }
                                this.f249169c.f249172c.invoke(new InterfaceC41402a.w(lZ02));
                                break;
                            }
                            break;
                        default:
                            b bVar = this.f249169c;
                            RatingFormStepFragment ratingFormStepFragment2 = bVar.f249170a.get();
                            FieldIdentifier fieldIdentifier = ratingFormStepFragment2 != null ? ratingFormStepFragment2.f249144Q0 : null;
                            if (fieldIdentifier != null) {
                                if (fieldIdentifier.c() || fieldIdentifier.d()) {
                                    ArrayList arrayList = new ArrayList();
                                    Intent intent4 = activityResult.f21243c;
                                    if (intent4 != null && (listA = C35974x2.a(intent4)) != null) {
                                        arrayList.addAll(listA);
                                    }
                                    if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                                        arrayList.add(data);
                                    }
                                    bVar.f249172c.invoke(new InterfaceC41402a.z(fieldIdentifier, arrayList));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        } else {
            hVarRegisterForActivityResult = null;
        }
        this.f249173d = hVarRegisterForActivityResult;
        RatingFormStepFragment ratingFormStepFragment2 = weakReference.get();
        if (ratingFormStepFragment2 != null) {
            final int i13 = 1;
            hVarRegisterForActivityResult2 = ratingFormStepFragment2.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.rating_form.step.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f249169c;

                {
                    this.f249169c = this;
                }

                @Override // androidx.view.result.a
                public final void a(Object obj) {
                    AddressParameter.Value value;
                    Bundle extras;
                    SelectParameter.Value value2;
                    String id2;
                    Bundle extras2;
                    Intent intent;
                    Uri data;
                    List<Uri> listA;
                    ActivityResult activityResult = (ActivityResult) obj;
                    switch (i13) {
                        case 0:
                            this.f249169c.f249171b.l(activityResult.f21242b == -1);
                            break;
                        case 1:
                            if (activityResult.f21242b == -1) {
                                Intent intent2 = activityResult.f21243c;
                                if (intent2 == null || (extras = intent2.getExtras()) == null) {
                                    value = null;
                                } else {
                                    value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : extras.getParcelable("EXTRA_ADDRESS_RESULT"));
                                }
                                this.f249169c.f249172c.invoke(new InterfaceC41402a.v(value));
                                break;
                            }
                            break;
                        case 2:
                            if (activityResult.f21242b == -1) {
                                Long lZ02 = null;
                                Intent intent3 = activityResult.f21243c;
                                if (intent3 == null || (extras2 = intent3.getExtras()) == null) {
                                    value2 = null;
                                } else {
                                    value2 = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras2.getParcelable("extra_value", SelectParameter.Value.class) : extras2.getParcelable("extra_value"));
                                }
                                if (value2 != null && (id2 = value2.getId()) != null) {
                                    lZ02 = C43066x.z0(id2);
                                }
                                this.f249169c.f249172c.invoke(new InterfaceC41402a.w(lZ02));
                                break;
                            }
                            break;
                        default:
                            b bVar = this.f249169c;
                            RatingFormStepFragment ratingFormStepFragment22 = bVar.f249170a.get();
                            FieldIdentifier fieldIdentifier = ratingFormStepFragment22 != null ? ratingFormStepFragment22.f249144Q0 : null;
                            if (fieldIdentifier != null) {
                                if (fieldIdentifier.c() || fieldIdentifier.d()) {
                                    ArrayList arrayList = new ArrayList();
                                    Intent intent4 = activityResult.f21243c;
                                    if (intent4 != null && (listA = C35974x2.a(intent4)) != null) {
                                        arrayList.addAll(listA);
                                    }
                                    if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                                        arrayList.add(data);
                                    }
                                    bVar.f249172c.invoke(new InterfaceC41402a.z(fieldIdentifier, arrayList));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        } else {
            hVarRegisterForActivityResult2 = null;
        }
        this.f249174e = hVarRegisterForActivityResult2;
        RatingFormStepFragment ratingFormStepFragment3 = weakReference.get();
        if (ratingFormStepFragment3 != null) {
            final int i14 = 2;
            hVarRegisterForActivityResult3 = ratingFormStepFragment3.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.rating_form.step.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f249169c;

                {
                    this.f249169c = this;
                }

                @Override // androidx.view.result.a
                public final void a(Object obj) {
                    AddressParameter.Value value;
                    Bundle extras;
                    SelectParameter.Value value2;
                    String id2;
                    Bundle extras2;
                    Intent intent;
                    Uri data;
                    List<Uri> listA;
                    ActivityResult activityResult = (ActivityResult) obj;
                    switch (i14) {
                        case 0:
                            this.f249169c.f249171b.l(activityResult.f21242b == -1);
                            break;
                        case 1:
                            if (activityResult.f21242b == -1) {
                                Intent intent2 = activityResult.f21243c;
                                if (intent2 == null || (extras = intent2.getExtras()) == null) {
                                    value = null;
                                } else {
                                    value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : extras.getParcelable("EXTRA_ADDRESS_RESULT"));
                                }
                                this.f249169c.f249172c.invoke(new InterfaceC41402a.v(value));
                                break;
                            }
                            break;
                        case 2:
                            if (activityResult.f21242b == -1) {
                                Long lZ02 = null;
                                Intent intent3 = activityResult.f21243c;
                                if (intent3 == null || (extras2 = intent3.getExtras()) == null) {
                                    value2 = null;
                                } else {
                                    value2 = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras2.getParcelable("extra_value", SelectParameter.Value.class) : extras2.getParcelable("extra_value"));
                                }
                                if (value2 != null && (id2 = value2.getId()) != null) {
                                    lZ02 = C43066x.z0(id2);
                                }
                                this.f249169c.f249172c.invoke(new InterfaceC41402a.w(lZ02));
                                break;
                            }
                            break;
                        default:
                            b bVar = this.f249169c;
                            RatingFormStepFragment ratingFormStepFragment22 = bVar.f249170a.get();
                            FieldIdentifier fieldIdentifier = ratingFormStepFragment22 != null ? ratingFormStepFragment22.f249144Q0 : null;
                            if (fieldIdentifier != null) {
                                if (fieldIdentifier.c() || fieldIdentifier.d()) {
                                    ArrayList arrayList = new ArrayList();
                                    Intent intent4 = activityResult.f21243c;
                                    if (intent4 != null && (listA = C35974x2.a(intent4)) != null) {
                                        arrayList.addAll(listA);
                                    }
                                    if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                                        arrayList.add(data);
                                    }
                                    bVar.f249172c.invoke(new InterfaceC41402a.z(fieldIdentifier, arrayList));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        } else {
            hVarRegisterForActivityResult3 = null;
        }
        this.f249175f = hVarRegisterForActivityResult3;
        RatingFormStepFragment ratingFormStepFragment4 = weakReference.get();
        if (ratingFormStepFragment4 != null) {
            final int i15 = 3;
            hVarRegisterForActivityResult4 = ratingFormStepFragment4.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.rating_form.step.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f249169c;

                {
                    this.f249169c = this;
                }

                @Override // androidx.view.result.a
                public final void a(Object obj) {
                    AddressParameter.Value value;
                    Bundle extras;
                    SelectParameter.Value value2;
                    String id2;
                    Bundle extras2;
                    Intent intent;
                    Uri data;
                    List<Uri> listA;
                    ActivityResult activityResult = (ActivityResult) obj;
                    switch (i15) {
                        case 0:
                            this.f249169c.f249171b.l(activityResult.f21242b == -1);
                            break;
                        case 1:
                            if (activityResult.f21242b == -1) {
                                Intent intent2 = activityResult.f21243c;
                                if (intent2 == null || (extras = intent2.getExtras()) == null) {
                                    value = null;
                                } else {
                                    value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : extras.getParcelable("EXTRA_ADDRESS_RESULT"));
                                }
                                this.f249169c.f249172c.invoke(new InterfaceC41402a.v(value));
                                break;
                            }
                            break;
                        case 2:
                            if (activityResult.f21242b == -1) {
                                Long lZ02 = null;
                                Intent intent3 = activityResult.f21243c;
                                if (intent3 == null || (extras2 = intent3.getExtras()) == null) {
                                    value2 = null;
                                } else {
                                    value2 = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras2.getParcelable("extra_value", SelectParameter.Value.class) : extras2.getParcelable("extra_value"));
                                }
                                if (value2 != null && (id2 = value2.getId()) != null) {
                                    lZ02 = C43066x.z0(id2);
                                }
                                this.f249169c.f249172c.invoke(new InterfaceC41402a.w(lZ02));
                                break;
                            }
                            break;
                        default:
                            b bVar = this.f249169c;
                            RatingFormStepFragment ratingFormStepFragment22 = bVar.f249170a.get();
                            FieldIdentifier fieldIdentifier = ratingFormStepFragment22 != null ? ratingFormStepFragment22.f249144Q0 : null;
                            if (fieldIdentifier != null) {
                                if (fieldIdentifier.c() || fieldIdentifier.d()) {
                                    ArrayList arrayList = new ArrayList();
                                    Intent intent4 = activityResult.f21243c;
                                    if (intent4 != null && (listA = C35974x2.a(intent4)) != null) {
                                        arrayList.addAll(listA);
                                    }
                                    if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                                        arrayList.add(data);
                                    }
                                    bVar.f249172c.invoke(new InterfaceC41402a.z(fieldIdentifier, arrayList));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        this.f249176g = hVarRegisterForActivityResult4;
    }
}
