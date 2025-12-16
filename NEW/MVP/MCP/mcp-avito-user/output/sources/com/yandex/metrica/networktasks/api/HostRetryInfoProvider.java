package com.yandex.metrica.networktasks.api;

/* loaded from: classes7.dex */
public interface HostRetryInfoProvider {
    long getLastAttemptTimeSeconds();

    int getNextSendAttemptNumber();

    void saveLastAttemptTimeSeconds(long j12);

    void saveNextSendAttemptNumber(int i12);
}
