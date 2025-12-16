package com.avito.android.evidence_request.details;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.evidence_request.details.EvidenceDetailsFragment;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.evidence_request.details.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class RunnableC30375a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f148250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f148251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f148252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148253e;

    public /* synthetic */ RunnableC30375a(LinearLayoutManager linearLayoutManager, int i12, int i13, int i14) {
        this.f148250b = i14;
        this.f148251c = linearLayoutManager;
        this.f148252d = i12;
        this.f148253e = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = this.f148253e;
        int i13 = this.f148252d;
        LinearLayoutManager linearLayoutManager = this.f148251c;
        switch (this.f148250b) {
            case 0:
                EvidenceDetailsFragment.a aVar = EvidenceDetailsFragment.f148226A0;
                linearLayoutManager.b2(i13, i12);
                break;
            default:
                int i14 = com.avito.android.evidence_request.mvi.evidence_details.g.f148989n;
                linearLayoutManager.b2(i13, i12);
                break;
        }
    }
}
