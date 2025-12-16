package com.avito.android.job.interview.domain;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.text.C43066x;
import sQ.C48095e;
import sQ.InterfaceC48091a;

/* compiled from: InterviewInvitationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/domain/g;", "Lcom/avito/android/job/interview/domain/e;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f174554a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC48091a f174555b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f174556c;

    @Inject
    public g(@k b bVar, @k InterfaceC48091a interfaceC48091a, @k String str) {
        this.f174554a = bVar;
        this.f174555b = interfaceC48091a;
        this.f174556c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.job.interview.domain.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.interview.domain.g.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.job.interview.domain.e
    @l
    public final Object b(@k i iVar, @k Continuation<? super TypedResult<G0>> continuation) {
        this.f174554a.getClass();
        Calendar calendar = Calendar.getInstance();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i12 = 0;
        for (Object obj : iVar.f174560a) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a aVar = (a) obj;
            calendar.set(2, aVar.f174540b);
            calendar.set(5, aVar.f174541c);
            List listF0 = C43066x.f0(aVar.f174543e, new String[]{":"}, 0, 6);
            calendar.set(11, Integer.parseInt((String) listF0.get(0)));
            calendar.set(12, Integer.parseInt((String) listF0.get(1)));
            SimpleDateFormat simpleDateFormat = b.f174546a;
            linkedHashMap.put("dates[" + i12 + "][from]", simpleDateFormat.format(calendar.getTime()));
            String str = aVar.f174544f;
            if (str != null) {
                List listF02 = C43066x.f0(str, new String[]{":"}, 0, 6);
                calendar.set(11, Integer.parseInt((String) listF02.get(0)));
                calendar.set(12, Integer.parseInt((String) listF02.get(1)));
                linkedHashMap.put("dates[" + i12 + "][to]", simpleDateFormat.format(calendar.getTime()));
            }
            i12 = i13;
        }
        C48095e c48095e = iVar.f174561b;
        linkedHashMap.put("location[lat]", String.valueOf(c48095e.getLat()));
        linkedHashMap.put("location[lng]", String.valueOf(c48095e.getLng()));
        linkedHashMap.put("location[text]", c48095e.getText());
        String str2 = iVar.f174562c;
        if (str2 != null) {
            linkedHashMap.put("phone", str2);
        }
        return this.f174555b.b(this.f174556c, linkedHashMap, continuation);
    }
}
