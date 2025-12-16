package com.avito.android.select;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.util.R1;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectDialogLogoStorageInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/j;", "Lcom/avito/android/select/i;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f265551a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<AK0.l> f265552b;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/select/k", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<Map<String, ? extends UniversalImage>> {
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/select/k", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<Map<String, ? extends Image>> {
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/select/k", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.google.gson.reflect.a<Map<String, ? extends UniversalImage>> {
    }

    public j(@Y61.k Gson gson, @Y61.k @Named("select_logo") h31.e<AK0.l> eVar) {
        this.f265551a = gson;
        this.f265552b = eVar;
    }

    public static UniversalImage g(SelectParameter.Value value) {
        SelectParameter.Value.Widget.Config config;
        SelectParameter.Value.Widget.Config.Displaying displaying;
        UniversalImage multiThemeImages;
        SelectParameter.Value.Display display = value.getDisplay();
        if (display != null && (multiThemeImages = display.getMultiThemeImages()) != null) {
            return multiThemeImages;
        }
        SelectParameter.Value.Widget widget = value.getWidget();
        if (widget == null || (config = widget.getConfig()) == null || (displaying = config.getDisplaying()) == null) {
            return null;
        }
        return displaying.getMultiThemeImages();
    }

    @Override // com.avito.android.select.i
    @Y61.l
    public final Map<String, Image> a(@Y61.k String str) {
        Object bVar;
        String strF = G.f("SectionedMultiselectImages_", str);
        try {
            int i12 = Z.f406624c;
            String string = this.f265552b.get().getString(strF);
            if (string != null) {
                Gson gson = this.f265551a;
                Type type = new b().getType();
                bVar = gson.e(string, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } else {
                bVar = null;
            }
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        Throwable thB = Z.b(bVar);
        if (thB != null) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to get value in SelectDialogLogoStorage", thB);
        }
        return (Map) (bVar instanceof Z.b ? null : bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.select.i
    public final void b(@Y61.k SectionedMultiselectParameter sectionedMultiselectParameter) {
        ?? arrayList;
        List<SectionedMultiselectParameter.Value> values = sectionedMultiselectParameter.getValues();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            List<SectionedMultiselectParameter.Value> options = ((SectionedMultiselectParameter.Value) it.next()).getOptions();
            if (options != null) {
                List<SectionedMultiselectParameter.Value> list = options;
                arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add((SectionedMultiselectParameter.Value) it2.next());
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            C42745f0.h((Iterable) arrayList, arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            SectionedMultiselectParameter.Display display = ((SectionedMultiselectParameter.Value) it3.next()).getDisplay();
            if ((display != null ? display.getMultiThemeImage() : null) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    SectionedMultiselectParameter.Value value = (SectionedMultiselectParameter.Value) it4.next();
                    SectionedMultiselectParameter.Display display2 = value.getDisplay();
                    List<UniversalColor> gradientColors = display2 != null ? display2.getGradientColors() : null;
                    if (gradientColors == null || gradientColors.isEmpty()) {
                        SectionedMultiselectParameter.Display display3 = value.getDisplay();
                        linkedHashMap.put(value.getId(), display3 != null ? display3.getMultiThemeImage() : null);
                        SectionedMultiselectParameter.Display display4 = value.getDisplay();
                        if (display4 != null) {
                            display4.setMultiThemeImage(null);
                        }
                    }
                }
                try {
                    String strL = this.f265551a.l(linkedHashMap);
                    this.f265552b.get().putString("SectionedMultiselectUniversalImages_" + sectionedMultiselectParameter.getId(), strL);
                    return;
                } catch (JsonIOException e12) {
                    V2.f318762a.a("DEFAULT_TAG", "Failed to save json in SelectDialogLogoStorage", e12);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.select.i
    public final void c(@Y61.k SectionedMultiselectParameter sectionedMultiselectParameter) {
        ?? arrayList;
        List<SectionedMultiselectParameter.Value> values = sectionedMultiselectParameter.getValues();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            List<SectionedMultiselectParameter.Value> options = ((SectionedMultiselectParameter.Value) it.next()).getOptions();
            if (options != null) {
                List<SectionedMultiselectParameter.Value> list = options;
                arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add((SectionedMultiselectParameter.Value) it2.next());
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            C42745f0.h((Iterable) arrayList, arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            SectionedMultiselectParameter.Display display = ((SectionedMultiselectParameter.Value) it3.next()).getDisplay();
            if ((display != null ? display.getImage() : null) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    SectionedMultiselectParameter.Value value = (SectionedMultiselectParameter.Value) it4.next();
                    SectionedMultiselectParameter.Display display2 = value.getDisplay();
                    linkedHashMap.put(value.getId(), display2 != null ? display2.getImage() : null);
                    SectionedMultiselectParameter.Display display3 = value.getDisplay();
                    if (display3 != null) {
                        display3.setImage(null);
                    }
                }
                try {
                    String strL = this.f265551a.l(linkedHashMap);
                    this.f265552b.get().putString("SectionedMultiselectImages_" + sectionedMultiselectParameter.getId(), strL);
                    return;
                } catch (JsonIOException e12) {
                    V2.f318762a.a("DEFAULT_TAG", "Failed to save json in SelectDialogLogoStorage", e12);
                    return;
                }
            }
        }
    }

    @Override // com.avito.android.select.i
    @Y61.l
    public final Map<String, UniversalImage> d(@Y61.k String str) {
        Object bVar;
        String strF = G.f("MultiThemeImages_", str);
        try {
            int i12 = Z.f406624c;
            String string = this.f265552b.get().getString(strF);
            if (string != null) {
                Gson gson = this.f265551a;
                Type type = new a().getType();
                bVar = gson.e(string, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } else {
                bVar = null;
            }
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        Throwable thB = Z.b(bVar);
        if (thB != null) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to get value in SelectDialogLogoStorage", thB);
        }
        return (Map) (bVar instanceof Z.b ? null : bVar);
    }

    @Override // com.avito.android.select.i
    public final void e(@Y61.k SelectParameter selectParameter) {
        SelectParameter.Value.Widget.Config config;
        Set<SelectParameter.Value> valuesSet = selectParameter.getValuesSet();
        if ((valuesSet instanceof Collection) && valuesSet.isEmpty()) {
            return;
        }
        Iterator<T> it = valuesSet.iterator();
        while (it.hasNext()) {
            if (g((SelectParameter.Value) it.next()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<T> it2 = selectParameter.getListToShow().iterator();
                while (it2.hasNext()) {
                    ParcelableEntity parcelableEntity = (ParcelableEntity) it2.next();
                    if (parcelableEntity instanceof SelectParameter.Value) {
                        SelectParameter.Value value = (SelectParameter.Value) parcelableEntity;
                        linkedHashMap.put(parcelableEntity.getId(), g(value));
                        SelectParameter.Value.Display display = value.getDisplay();
                        if (display != null) {
                            display.setMultiThemeImages(null);
                        }
                        SelectParameter.Value.Widget widget = value.getWidget();
                        SelectParameter.Value.Widget.Config.Displaying displaying = (widget == null || (config = widget.getConfig()) == null) ? null : config.getDisplaying();
                        if (displaying != null) {
                            displaying.setMultiThemeImages(null);
                        }
                    }
                }
                try {
                    String strL = this.f265551a.l(linkedHashMap);
                    this.f265552b.get().putString("MultiThemeImages_" + selectParameter.getId(), strL);
                    return;
                } catch (JsonIOException e12) {
                    V2.f318762a.a("DEFAULT_TAG", "Failed to save json in SelectDialogLogoStorage", e12);
                    return;
                }
            }
        }
    }

    @Override // com.avito.android.select.i
    @Y61.l
    public final Map<String, UniversalImage> f(@Y61.k String str) {
        Object bVar;
        String strF = G.f("SectionedMultiselectUniversalImages_", str);
        try {
            int i12 = Z.f406624c;
            String string = this.f265552b.get().getString(strF);
            if (string != null) {
                Gson gson = this.f265551a;
                Type type = new c().getType();
                bVar = gson.e(string, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } else {
                bVar = null;
            }
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        Throwable thB = Z.b(bVar);
        if (thB != null) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to get value in SelectDialogLogoStorage", thB);
        }
        return (Map) (bVar instanceof Z.b ? null : bVar);
    }
}
