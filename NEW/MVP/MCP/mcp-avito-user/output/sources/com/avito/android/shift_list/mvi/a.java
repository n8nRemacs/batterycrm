package com.avito.android.shift_list.mvi;

import android.app.Application;
import android.content.res.Resources;
import com.avito.android.deep_linking.x;
import com.avito.android.gig.shift_list.generated.api.get_giger_slots_v_1.Timer;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetTimer;
import com.avito.android.shift_list.ui.list.title_item.ShiftTitleItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GetGigerSlotsV1ResponseToItemsMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/shift_list/mvi/a;", "Lkotlin/Function2;", "LDG/e;", "", "", "Lcom/avito/conveyor_item/a;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements Y41.p<DG.e, Boolean, List<? extends com.avito.conveyor_item.a>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_snippet.a f281045b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f281046c;

    /* renamed from: d, reason: collision with root package name */
    public final Resources f281047d;

    /* compiled from: GetGigerSlotsV1ResponseToItemsMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shift_list.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8368a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f281048a;

        static {
            int[] iArr = new int[Timer.Direction.values().length];
            try {
                iArr[Timer.Direction.UntilStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Timer.Direction.UntilFinished.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Timer.Direction.AfterStart.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f281048a = iArr;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.gig_snippet.a aVar, @Y61.k x xVar, @Y61.k Application application) {
        this.f281045b = aVar;
        this.f281046c = xVar;
        this.f281047d = application.getResources();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.ArrayList r27, DG.d r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.shift_list.mvi.a.a(java.util.ArrayList, DG.d):void");
    }

    public final GigShiftSnippetTimer b(String str, String str2, String str3, int i12, boolean z12) {
        Long lC2 = this.f281045b.c(str);
        if (lC2 != null) {
            return new GigShiftSnippetTimer(i12, lC2.longValue(), str2, str3, z12);
        }
        return null;
    }

    @Y61.k
    public final ArrayList d(@Y61.k DG.e eVar, boolean z12) throws Resources.NotFoundException {
        List<DG.d> listA;
        List<DG.d> listA2;
        ArrayList arrayList = new ArrayList();
        DG.m upcoming = eVar.getUpcoming();
        if (upcoming != null && (listA2 = upcoming.a()) != null) {
            Iterator<T> it = listA2.iterator();
            while (it.hasNext()) {
                a(arrayList, (DG.d) it.next());
            }
        }
        if (z12) {
            DG.l past = eVar.getPast();
            if ((past != null ? past.getTitle() : null) != null) {
                arrayList.add(new ShiftTitleItem(past.getTitle(), past.getTitle()));
            }
        }
        DG.l past2 = eVar.getPast();
        if (past2 != null && (listA = past2.a()) != null) {
            Iterator<T> it2 = listA.iterator();
            while (it2.hasNext()) {
                a(arrayList, (DG.d) it2.next());
            }
        }
        return arrayList;
    }

    @Override // Y41.p
    public final /* bridge */ /* synthetic */ List<? extends com.avito.conveyor_item.a> invoke(DG.e eVar, Boolean bool) {
        return d(eVar, bool.booleanValue());
    }
}
